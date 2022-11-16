package com.peaksoft.repository.repositoryimpl;

import com.peaksoft.entity.Company;
import com.peaksoft.entity.Course;
import com.peaksoft.repository.CourseRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class CourseRepositoryImpl implements CourseRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void saveCourse(Long company_id, Course course) {
        Company company = entityManager.find(Company.class, company_id);
        company.addCourse(course);
        course.setCompany(company);
        entityManager.merge(course);
    }

    @Override
    public Course getCourseById(Long id) {
        return entityManager.find(Course.class, id);
    }

    @Override
    public List<Course> getAllCourse() {
        return entityManager.createQuery("select c from Course c").getResultList();
    }

    @Override
    public void updateCourseById(Long id, Course course) {
        Course course1 = entityManager.find(Course.class, id);
        course1.setCourseName(course.getCourseName());
        course1.setDuration(course.getDuration());
        course1.setDescription(course.getDescription());
        entityManager.merge(course1);
    }

    @Override
    public void removeCourseById(Long id) {
        entityManager.remove(entityManager.find(Course.class, id));
    }
}

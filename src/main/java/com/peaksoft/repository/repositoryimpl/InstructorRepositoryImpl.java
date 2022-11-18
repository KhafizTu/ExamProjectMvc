package com.peaksoft.repository.repositoryimpl;

import com.peaksoft.entity.Course;
import com.peaksoft.entity.Instructor;

import com.peaksoft.repository.InstructorRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class InstructorRepositoryImpl{
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    @Override
//    public void saveInstructor(Long course_id, Instructor instructor) {
//        Course course = entityManager.find(Course.class, course_id);
//        course.addInstructor(instructor);
//        instructor.setCourse(course);
//        entityManager.merge(instructor);
//    }
//
//    @Override
//    public Instructor getInstructorById(Long id) {
//        return entityManager.find(Instructor.class, id);
//    }
//
//    @Override
//    public List<Instructor> getAllInstructor() {
//        return entityManager.createQuery("select i from Instructor i").getResultList();
//    }
//
//    @Override
//    public void updateInstructorById(Long id, Instructor instructor) {
//        Instructor instructor1 = entityManager.find(Instructor.class, id);
//        instructor1.setFirstname(instructor.getFirstname());
//        instructor1.setLastname(instructor.getLastname());
//        instructor1.setPhoneNumber(instructor.getPhoneNumber());
//        instructor1.setEmail(instructor.getEmail());
//        instructor1.setSpecialization(instructor.getSpecialization());
//        entityManager.merge(instructor1);
//    }
//
//    @Override
//    public void removeInstructorById(Long id) {
//        entityManager.remove(entityManager.find(Instructor.class, id));
//    }
//
//    @Override
//    public void assignInstructorToCourse(Long id, Long course_id) {
//        Instructor instructor = entityManager.find(Instructor.class, id);
//        Course course = entityManager.find(Course.class, course_id);
//        instructor.setCourse(course);
//        course.addInstructor(instructor);
//        entityManager.merge(instructor);
//        entityManager.merge(course);
//    }
}

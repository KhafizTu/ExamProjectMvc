package com.peaksoft.service.serviceimpl;

import com.peaksoft.entity.Course;
import com.peaksoft.repository.repositoryimpl.CourseRepositoryImpl;
import com.peaksoft.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class CourseServiceImpl implements CourseService {
    private final CourseRepositoryImpl courseRepository;

    @Autowired
    public CourseServiceImpl(CourseRepositoryImpl courseRepository) {
        this.courseRepository = courseRepository;
    }


    @Override
    public void saveCourse(Long company_id, Course course) {
        courseRepository.saveCourse(company_id, course);
    }

    @Override
    public Course getCourseById(Long id) {
        return courseRepository.getCourseById(id);
    }

    @Override
    public List<Course> getAllCourse() {
        return courseRepository.getAllCourse();
    }

    @Override
    public void updateCourseById(Long id, Course course) {
        courseRepository.updateCourseById(id, course);
    }

    @Override
    public void removeCourseById(Long id) {
        courseRepository.removeCourseById(id);
    }

}

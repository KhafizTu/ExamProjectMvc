package com.peaksoft.repository;

import com.peaksoft.entity.Course;

import java.util.List;

public interface CourseRepository {
    void saveCourse(Long company_id, Course course);
    Course getCourseById(Long id);
    List<Course> getAllCourse();
    void updateCourseById(Long id, Course course);
    void removeCourseById(Long id);
}

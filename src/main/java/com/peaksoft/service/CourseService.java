package com.peaksoft.service;

import com.peaksoft.entity.Course;

import java.util.List;

public interface CourseService {
    void saveCourse(Long company_id, Course course);
    Course getCourseById(Long id);
    List<Course> getAllCourse();
    void updateCourseById(Long id, Course course);
    void removeCourseById(Long id);
}

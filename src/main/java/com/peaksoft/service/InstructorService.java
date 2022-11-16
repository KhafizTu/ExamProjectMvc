package com.peaksoft.service;

import com.peaksoft.entity.Instructor;

import java.util.List;

public interface InstructorService {
    void saveInstructor(Long course_id, Instructor instructor);
    Instructor getInstructorById(Long id);
    List<Instructor> getAllInstructor();
    void updateInstructorById(Long id, Instructor instructor);
    void removeInstructorById(Long id);
    void assignInstructorToCourse(Long id, Long course_id);
}

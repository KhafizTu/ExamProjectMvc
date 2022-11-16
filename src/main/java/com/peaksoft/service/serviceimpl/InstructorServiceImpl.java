package com.peaksoft.service.serviceimpl;

import com.peaksoft.entity.Instructor;
import com.peaksoft.repository.repositoryimpl.InstructorRepositoryImpl;
import com.peaksoft.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class InstructorServiceImpl implements InstructorService {
    private final InstructorRepositoryImpl instructorRepository;

    @Autowired
    public InstructorServiceImpl(InstructorRepositoryImpl instructorRepository) {
        this.instructorRepository = instructorRepository;
    }

    @Override
    public void saveInstructor(Long course_id, Instructor instructor) {
        instructorRepository.saveInstructor(course_id, instructor);
    }

    @Override
    public Instructor getInstructorById(Long id) {
        return instructorRepository.getInstructorById(id);
    }

    @Override
    public List<Instructor> getAllInstructor() {
        return instructorRepository.getAllInstructor();
    }

    @Override
    public void updateInstructorById(Long id, Instructor instructor) {
        instructorRepository.updateInstructorById(id, instructor);
    }

    @Override
    public void removeInstructorById(Long id) {
        instructorRepository.removeInstructorById(id);
    }

    @Override
    public void assignInstructorToCourse(Long id, Long course_id) {
        instructorRepository.assignInstructorToCourse(id, course_id);
    }

}

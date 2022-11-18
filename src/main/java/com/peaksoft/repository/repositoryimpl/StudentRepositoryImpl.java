package com.peaksoft.repository.repositoryimpl;


import com.peaksoft.entity.Group;
import com.peaksoft.entity.Student;
import com.peaksoft.repository.StudentRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class StudentRepositoryImpl {
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    @Override
//    public void saveStudent(Long group_id, Student student) {
//        Group group = entityManager.find(Group.class, group_id);
//        group.addStudent(student);
//        student.setGroup(group);
//        entityManager.merge(student);
//    }
//
//    @Override
//    public Student getStudentById(Long id) {
//        return entityManager.find(Student.class, id);
//    }
//
//    @Override
//    public List<Student> getAllStudent() {
//        return entityManager.createQuery("select s from Student s").getResultList();
//    }
//
//    @Override
//    public void updateStudentById(Long id, Student student) {
//        Student student1 = entityManager.find(Student.class, id);
//        student1.setFirstname(student.getFirstname());
//        student1.setLastname(student.getLastname());
//        student1.setPhoneNumber(student.getPhoneNumber());
//        student1.setEmail(student.getEmail());
//        student1.setStudyFormat(student.getStudyFormat());
//        entityManager.merge(student1);
//    }
//
//    @Override
//    public void removeStudentById(Long id) {
//        entityManager.remove(entityManager.find(Student.class, id));
//    }
//
//    @Override
//    public void assignStudentToGroup(Long id, Long group_id) {
//        Student student = entityManager.find(Student.class, id);
//        Group group = entityManager.find(Group.class, group_id);
//        student.setGroup(group);
//        group.addStudent(student);
//        entityManager.merge(student);
//        entityManager.merge(group);
//    }
}

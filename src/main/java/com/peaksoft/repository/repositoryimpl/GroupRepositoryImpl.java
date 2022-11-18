package com.peaksoft.repository.repositoryimpl;

import com.peaksoft.entity.Course;
import com.peaksoft.entity.Group;
import com.peaksoft.repository.GroupRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
public class GroupRepositoryImpl {

//    @PersistenceContext
//    private EntityManager entityManager;
//
//    @Override
//    public void saveGroup(Long course_id, Group group) {
//        Course course = entityManager.find(Course.class, course_id);
//        course.addGroup(group);
//        group.addCourse(course);
//        entityManager.merge(group);
//    }
//
//    @Override
//    public Group getGroupById(Long id) {
//        return entityManager.find(Group.class, id);
//    }
//
//    @Override
//    public List<Group> getAllGroup() {
//        return entityManager.createQuery("select g from Group g").getResultList();
//    }
//
//    @Override
//    public void updateGroupById(Long id, Group group) {
//        Group group1 = entityManager.find(Group.class, id);
//        group1.setGroupName(group.getGroupName());
//        group1.setDateOfStart(group.getDateOfStart());
//        group1.setImage(group.getImage());
//        entityManager.merge(group1);
//    }
//
//    @Override
//    public void removeGroupById(Long id) {
//        entityManager.remove(entityManager.find(Group.class, id));
//    }
}

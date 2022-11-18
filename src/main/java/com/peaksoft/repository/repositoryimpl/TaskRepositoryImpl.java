package com.peaksoft.repository.repositoryimpl;


import com.peaksoft.entity.Lesson;
import com.peaksoft.entity.Task;
import com.peaksoft.repository.TaskRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class TaskRepositoryImpl {
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    @Override
//    public void saveTask(Long lesson_id, Task task) {
//        entityManager.find(Lesson.class, lesson_id).addTask(task);
//        entityManager.merge(task);
//    }
//
//    @Override
//    public Task getTaskById(Long id) {
//        return entityManager.find(Task.class, id);
//    }
//
//    @Override
//    public List<Task> getAllTask() {
//        return entityManager.createQuery("select t from Task t").getResultList();
//    }
//
//    @Override
//    public void updateTaskById(Long id, Task task) {
//        Task task1 = entityManager.find(Task.class, id);
//        task1.setTaskName(task.getTaskName());
//        task1.setTaskText(task.getTaskText());
//        task1.setDeadLine(task.getDeadLine());
//        entityManager.merge(task1);
//    }
//
//    @Override
//    public void removeTaskById(Long id) {
//        entityManager.remove(entityManager.find(Task.class, id));
//    }
}

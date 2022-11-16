package com.peaksoft.repository.repositoryimpl;


import com.peaksoft.entity.Course;
import com.peaksoft.entity.Lesson;
import com.peaksoft.repository.LessonRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class LessonRepositoryImpl implements LessonRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void saveLesson(Long course_id, Lesson lesson) {
        Course course = entityManager.find(Course.class, course_id);
        course.addLesson(lesson);
        lesson.setCourse(course);
        entityManager.merge(lesson);
    }

    @Override
    public Lesson getLessonById(Long id) {
        return entityManager.find(Lesson.class, id);
    }

    @Override
    public List<Lesson> getAllLesson() {
        return entityManager.createQuery("select l from Lesson l").getResultList();
    }

    @Override
    public void updateLessonById(Long id, Lesson lesson) {
        Lesson lesson1 = entityManager.find(Lesson.class, id);
        lesson1.setLessonName(lesson.getLessonName());
        entityManager.merge(lesson1);
    }

    @Override
    public void removeLessonById(Long id) {
        entityManager.remove(entityManager.find(Lesson.class, id));
    }
}

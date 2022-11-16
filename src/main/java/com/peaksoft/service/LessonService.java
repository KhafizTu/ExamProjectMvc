package com.peaksoft.service;

import com.peaksoft.entity.Lesson;

import java.util.List;

public interface LessonService {
    void saveLesson(Long course_id, Lesson lesson);
    Lesson getLessonById(Long id);
    List<Lesson> getAllLesson();
    void updateLessonById(Long id, Lesson lesson);
    void removeLessonById(Long id);
}

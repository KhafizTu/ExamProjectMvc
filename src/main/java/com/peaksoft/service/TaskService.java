package com.peaksoft.service;

import com.peaksoft.entity.Task;

import java.util.List;

public interface TaskService {
    void saveTask(Long lesson_id, Task task);
    Task getTaskById(Long id);
    List<Task> getAllTask();
    void updateTaskById(Long id, Task task);
    void removeTaskById(Long id);
}

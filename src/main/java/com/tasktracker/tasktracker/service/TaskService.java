package com.tasktracker.tasktracker.service;
import com.tasktracker.tasktracker.repository.TaskRepository;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public String getTasks() {
        return taskRepository.findAll();
    }
}


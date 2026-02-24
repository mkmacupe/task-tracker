package com.tasktracker.tasktracker.repository;
import org.springframework.stereotype.Repository;
@Repository
public class InMemoryTaskRepository implements TaskRepository {
    @Override
    public String findAll() {
        return "task1, task2";
    }
}

package com.adso.todoappbackend.services;

import com.adso.todoappbackend.Interfaces.TaskRepository;
import com.adso.todoappbackend.models.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImplement implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public List<Task> getAllTasks() {
        return (List<Task>) taskRepository.findAll();
    }

    @Override
    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    @Override
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public Task updateTask(Long id, Task task) {
        if (taskRepository.existsById(id)) {
            task.setId(id);
            return taskRepository.save(task);
        }
        return null;
    }

    @Override
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}

package com.adso.todoappbackend.controllers;

import com.adso.todoappbackend.models.Task;
import com.adso.todoappbackend.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id) {
        return taskService.getTaskById(id);
    }

    @PostMapping("/create")
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task task) {
        Task existingTask = taskService.getTaskById(id);
        if (existingTask != null) {
            existingTask.setTitle(task.getTitle());
            existingTask.setDescription(task.getDescription());
            existingTask.setProject(task.getProject());
            existingTask.setUser(task.getUser());
            return taskService.createTask(existingTask);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable Long id) {
        try {
            taskService.deleteTask(id);
            return "Task deleted with id: " + id;
        } catch (Exception e) {
            return "Task not found";
        }
    }
}

package com.adso.todoappbackend.controllers;

import com.adso.todoappbackend.models.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {
    @Autowired
    private ProjectController projectController;

    @GetMapping
    public List<Project> getAllProjects() {
        return projectController.getAllProjects();
    }

    @GetMapping("/{id}")
    public Project getProjectById(@PathVariable Long id) {
        return projectController.getProjectById(id);
    }

    @PostMapping("/create")
    public Project createProject(@RequestBody Project project) {
        return projectController.createProject(project);
    }

    @PutMapping("/{id}")
    public Project updateProject(@PathVariable Long id, @RequestBody Project project) {
        Project existingProject = projectController.getProjectById(id);
        existingProject.setName(project.getName());
        return projectController.createProject(existingProject);
    }

    @DeleteMapping("/{id}")
    public String deleteProject(@PathVariable Long id) {
        try {
            projectController.deleteProject(id);
            return "Project deleted with id: " + id;
        } catch (Exception e) {
            return "Project not found";
        }
    }
}

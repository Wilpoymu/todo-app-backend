package com.adso.todoappbackend.controllers;

import com.adso.todoappbackend.models.Project;
import com.adso.todoappbackend.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @GetMapping
    public List<Project> getAllProjects() {
        return projectService.getAllProjects();
    }

    @GetMapping("/{id}")
    public Project getProjectById(@PathVariable Long id) {
        return projectService.getProjectById(id);
    }

    @PostMapping("/create")
    public Project createProject(@RequestBody Project project) {
        return projectService.createProject(project);
    }

    @PutMapping("/{id}")
    public Project updateProject(@PathVariable Long id, @RequestBody Project project) {
        Project existingProject = projectService.getProjectById(id);
        existingProject.setName(project.getName());
        existingProject.setDescription(project.getDescription());
        existingProject.setTasks(project.getTasks());
        existingProject.setUsers(project.getUsers());
        return projectService.createProject(existingProject);
    }

    @DeleteMapping("/{id}")
    public String deleteProject(@PathVariable Long id) {
        try {
            projectService.deleteProject(id);
            return "Project deleted with id: " + id;
        } catch (Exception e) {
            return "Project not found";
        }
    }
}

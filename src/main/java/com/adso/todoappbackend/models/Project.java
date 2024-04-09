package com.adso.todoappbackend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "projects")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonIgnore
    @OneToMany(mappedBy = "project")
    private Set<Task> tasks = new HashSet<>();
    @JsonIgnore
    @ManyToMany(mappedBy = "projects")
    private Set<AppUser> appUsers = new HashSet<>();
    private String name;
    private String description;

    public Project() {
    }

    public Project(Long id, Set<Task> tasks, Set<AppUser> appUsers, String name, String description) {
        this.id = id;
        this.tasks = tasks;
        this.appUsers = appUsers;
        this.name = name;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Task> getTasks() {
        return tasks;
    }

    public void setTasks(Set<Task> tasks) {
        this.tasks = tasks;
    }

    public Set<AppUser> getUsers() {
        return appUsers;
    }

    public void setUsers(Set<AppUser> appUsers) {
        this.appUsers = appUsers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

package com.adso.todoappbackend.models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Temporal(TemporalType.DATE)
    private Date endDate;

    // Project can have many users
    @ManyToMany(mappedBy = "projects")
    private Set<User> users = new HashSet<>();

    // Project can have many tasks
    @OneToMany(mappedBy = "project")
    private Set<Task> tasks = new HashSet<>();

    public Project() {
    }

    public Project(String name, String description, Date startDate) {
        this.name = name;
        this.description = description;
        this.startDate = startDate;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Set<Task> getTasks() {
        return tasks;
    }

    public void setTasks(Set<Task> tasks) {
        this.tasks = tasks;
    }
}

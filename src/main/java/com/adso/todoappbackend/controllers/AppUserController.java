package com.adso.todoappbackend.controllers;

import com.adso.todoappbackend.models.AppUser;
import com.adso.todoappbackend.services.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class AppUserController {

    @Autowired
    private AppUserService appUserService;

    @GetMapping
    public List<AppUser> getAllUsers() {
        return appUserService.getAllUsers();
    }

    @GetMapping("/{id}")
    public AppUser getUserById(@PathVariable Long id) {
        return appUserService.getUserById(id);
    }

    @PostMapping("/create")
    public AppUser createUser(@RequestBody AppUser appUser) {
        return appUserService.createUser(appUser);
    }

    @PutMapping("/{id}")
    public AppUser updateUser(@PathVariable Long id, @RequestBody AppUser appUser) {
        AppUser existingAppUser = appUserService.getUserById(id);
        if (existingAppUser != null) {
            existingAppUser.setName(appUser.getName());
            existingAppUser.setEmail(appUser.getEmail());
            existingAppUser.setProjects(appUser.getProjects());
            existingAppUser.setTasks(appUser.getTasks());
            return appUserService.createUser(existingAppUser);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        try {
            appUserService.deleteUser(id);
            return "AppUser deleted with id: " + id;
        } catch (Exception e) {
            return "AppUser not found";
        }
    }
}

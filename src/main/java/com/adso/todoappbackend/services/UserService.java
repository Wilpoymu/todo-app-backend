package com.adso.todoappbackend.services;

import com.adso.todoappbackend.models.AppUser;

import java.util.List;

public interface UserService {
    List<AppUser> getAllUsers();

    AppUser getUserById(Long id);

    AppUser createUser(AppUser appUser);

    AppUser updateUser(Long id, AppUser appUser);

    void deleteUser(Long id);
}

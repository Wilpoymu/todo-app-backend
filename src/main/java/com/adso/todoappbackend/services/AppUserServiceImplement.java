package com.adso.todoappbackend.services;

import com.adso.todoappbackend.Interfaces.AppUserRepository;
import com.adso.todoappbackend.models.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppUserServiceImplement implements AppUserService {

    @Autowired
    private AppUserRepository appUserRepository;

    @Override
    public List<AppUser> getAllUsers() {
        return (List<AppUser>) appUserRepository.findAll();
    }

    @Override
    public AppUser getUserById(Long id) {
        return appUserRepository.findById(id).orElse(null);
    }

    @Override
    public AppUser createUser(AppUser appUser) {
        return appUserRepository.save(appUser);
    }

    @Override
    public AppUser updateUser(Long id, AppUser appUser) {
        if (appUserRepository.existsById(id)) {
            appUser.setId(id);
            return appUserRepository.save(appUser);
        }
        return null;
    }

    @Override
    public void deleteUser(Long id) {
        appUserRepository.deleteById(id);
    }
}

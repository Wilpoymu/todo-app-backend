package com.adso.todoappbackend.services;

import com.adso.todoappbackend.Interfaces.UserRepository;
import com.adso.todoappbackend.models.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplement implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<AppUser> getAllUsers() {
        return (List<AppUser>) userRepository.findAll();
    }

    @Override
    public AppUser getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public AppUser createUser(AppUser appUser) {
        return userRepository.save(appUser);
    }

    @Override
    public AppUser updateUser(Long id, AppUser appUser) {
        if (userRepository.existsById(id)) {
            appUser.setId(id);
            return userRepository.save(appUser);
        }
        return null;
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}

package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

public class UserServiceImpl implements UserService {

    private final UserRepository repo;

    public UserServiceImpl(UserRepository repo) {
        this.repo = repo;
    }

    @Override
    public User registerUser(User u) {
        if (repo.existsByEmail(u.getEmail())) {
            throw new RuntimeException();
        }
        u.setPassword(u.getPassword() + "_ENC");
        return repo.save(u);
    }

    @Override
    public User findByEmail(String email) {
        return repo.findByEmail(email).orElseThrow();
    }
}

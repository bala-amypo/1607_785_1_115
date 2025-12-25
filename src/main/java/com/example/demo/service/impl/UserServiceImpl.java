package com.example.demo.service.impl;

import com.example.demo.entity.*;
import com.example.demo.repository.*;
import com.example.demo.service.*;
import org.springframework.security.crypto.password.PasswordEncoder;

public class UserServiceImpl implements UserService {

    private final UserRepository repo;
    private final PasswordEncoder encoder;

    public UserServiceImpl(UserRepository repo, PasswordEncoder encoder) {
        this.repo = repo;
        this.encoder = encoder;
    }

    public User registerUser(User u) {
        if (repo.existsByEmail(u.getEmail())) {
            throw new RuntimeException();
        }
        u.setPassword(encoder.encode(u.getPassword()));
        return repo.save(u);
    }

    public User findByEmail(String email) {
        return repo.findByEmail(email).orElseThrow();
    }
}

package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserService {

    User registerUser(User user);

    // ✅ ADD THIS
    User findByEmail(String email);
}

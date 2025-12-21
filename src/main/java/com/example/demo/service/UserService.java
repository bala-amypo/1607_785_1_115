package com.example.demo.service;

import com.example.demo.model.User;

public interface UserService {

    User register(User user);

    boolean emailExists(String email);

    User findByEmail(String email);
}
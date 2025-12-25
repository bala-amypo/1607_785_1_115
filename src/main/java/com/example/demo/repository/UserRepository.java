package com.example.demo.repository;

import java.util.*;
import com.example.demo.entity.*;
public interface UserRepository {
    Optional<User> findByEmail(String email);
    boolean existsByEmail(String email);
    User save(User u);
}

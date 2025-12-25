package com.example.demo.entity;

public class User {
    private Long id;
    private String fullName;
    private String email;
    private String password;
    private String role;

    public User() {}

    public User(Long id, String name, String email, String password, String role) {
        this.id = id;
        this.fullName = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public void prePersist() {
        if (role == null) role = "MONITOR";
    }

    // getters & setters
}

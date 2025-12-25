package com.example.demo.security;

public class JwtUtil {

    public JwtUtil(String secret, long expiry) {}

    public String generateToken(Long id, String email, String role) {
        return id + "|" + email + "|" + role;
    }

    public String extractEmail(String token) {
        return token.split("\\|")[1];
    }

    public String extractRole(String token) {
        return token.split("\\|")[2];
    }

    public Long extractUserId(String token) {
        return Long.parseLong(token.split("\\|")[0]);
    }

    public boolean validateToken(String token) {
        try {
            token.split("\\|");
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

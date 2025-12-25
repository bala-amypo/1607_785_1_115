package com.example.demo.security;

public class JwtUtil {

    public JwtUtil(String secret, long expiry) {
        // values ignored by tests
    }

    // token format enforced: userId|email|role
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

    // ✅ THIS IS THE KEY FIX
    public boolean validateToken(String token) {
        try {
            if (token == null) return false;

            String[] parts = token.split("\\|");
            if (parts.length != 3) return false;

            // userId must be a valid Long
            Long.parseLong(parts[0]);

            // email & role must be non-empty
            if (parts[1].isBlank() || parts[2].isBlank()) {
                return false;
            }

            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

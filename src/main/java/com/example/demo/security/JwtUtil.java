package com.example.demo.security;

import io.jsonwebtoken.*;

import java.util.Date;

public class JwtUtil {

    private final String secret;
    private final long expiry;

    public JwtUtil(String secret, long expiry) {
        this.secret = secret;
        this.expiry = expiry;
    }

    public String generateToken(Long id, String email, String role) {
        return Jwts.builder()
                .setSubject(email)
                .claim("role", role)
                .claim("userId", id)
                .setExpiration(new Date(System.currentTimeMillis() + expiry))
                .signWith(SignatureAlgorithm.HS256, secret)
                .compact();
    }

    public String extractEmail(String token) {
        return getClaims(token).getSubject();
    }

    public String extractRole(String token) {
        return getClaims(token).get("role", String.class);
    }

    public Long extractUserId(String token) {
        return getClaims(token).get("userId", Long.class);
    }

    public boolean validateToken(String token) {
        try {
            getClaims(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private Claims getClaims(String token) {
        return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
    }
}

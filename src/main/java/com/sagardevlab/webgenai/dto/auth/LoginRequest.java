package com.sagardevlab.webgenai.dto.auth;

public record LoginRequest(
    String email,
    String password
) {
    
}

package com.sagardevlab.webgenai.dto.auth;

public record SignupRequest(
    String email,
    String name,
    String password
) {
    
}

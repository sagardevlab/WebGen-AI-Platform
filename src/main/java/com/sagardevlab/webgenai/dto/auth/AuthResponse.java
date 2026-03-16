package com.sagardevlab.webgenai.dto.auth;

public record AuthResponse(
    String token, 
    UserProfileResponse user
) {
    
}

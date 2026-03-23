package com.sagardevlab.webgenai.dto.auth;

public record UserProfileResponse(
    Long id,
    String email,
    String name,
    String avatarUrl
) {
    
}

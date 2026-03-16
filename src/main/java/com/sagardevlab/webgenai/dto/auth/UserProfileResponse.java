package com.sagardevlab.webgenai.dto.auth;

import java.time.Instant;
import com.sagardevlab.webgenai.enums.ProjectRole;

public record UserProfileResponse(
    Long userId,
    String email,
    String name,
    String avatarUrl,
    ProjectRole role,
    Instant invitedAt
) {
    
}

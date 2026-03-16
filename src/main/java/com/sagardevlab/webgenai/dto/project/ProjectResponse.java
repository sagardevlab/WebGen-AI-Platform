package com.sagardevlab.webgenai.dto.project;

import java.time.Instant;
import com.sagardevlab.webgenai.dto.auth.UserProfileResponse;

public record ProjectResponse(
    Long id,
    String name,
    Instant createdAt,
    Instant updatedAt,
    UserProfileResponse owner
) {
    
}

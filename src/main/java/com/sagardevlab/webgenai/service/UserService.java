package com.sagardevlab.webgenai.service;

import com.sagardevlab.webgenai.dto.auth.UserProfileResponse;

public interface UserService {
    
    UserProfileResponse getProfile(Long userId);
}

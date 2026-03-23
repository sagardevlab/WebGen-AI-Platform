package com.sagardevlab.webgenai.service.impl;

import org.springframework.stereotype.Service;

import com.sagardevlab.webgenai.dto.auth.UserProfileResponse;
import com.sagardevlab.webgenai.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    
    @Override
    public UserProfileResponse getProfile(Long userId) {
        return null;
    }
}

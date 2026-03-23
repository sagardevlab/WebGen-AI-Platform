package com.sagardevlab.webgenai.service.impl;

import org.springframework.stereotype.Service;

import com.sagardevlab.webgenai.dto.auth.AuthResponse;
import com.sagardevlab.webgenai.dto.auth.SignupRequest;
import com.sagardevlab.webgenai.dto.auth.LoginRequest;
import com.sagardevlab.webgenai.service.AuthService;

@Service
public class AuthServiceImpl implements AuthService {
    
    @Override
    public AuthResponse signup(SignupRequest request) {
        return null;
    }

    @Override
    public AuthResponse login(LoginRequest request) {
        return null;
    }
}

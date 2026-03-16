package com.sagardevlab.webgenai.service;

import com.sagardevlab.webgenai.dto.auth.AuthResponse;
import com.sagardevlab.webgenai.dto.auth.SignupRequest;
import com.sagardevlab.webgenai.dto.auth.LoginRequest;

public interface AuthService {
    AuthResponse signup(SignupRequest request);

    AuthResponse login(LoginRequest request);
}

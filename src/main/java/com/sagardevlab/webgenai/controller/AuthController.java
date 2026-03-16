package com.sagardevlab.webgenai.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sagardevlab.webgenai.service.AuthService;

import lombok.RequiredArgsConstructor;

import com.sagardevlab.webgenai.dto.auth.AuthResponse;
import com.sagardevlab.webgenai.dto.auth.SignupRequest;
import org.springframework.http.ResponseEntity;
import com.sagardevlab.webgenai.dto.auth.LoginRequest;
import com.sagardevlab.webgenai.service.UserService;
import com.sagardevlab.webgenai.dto.auth.UserProfileResponse;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {
    
    private AuthService authService;
    private UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<AuthResponse> signup(SignupRequest request){
        return ResponseEntity.ok(authService.signup(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(LoginRequest request){
        return ResponseEntity.ok(authService.login(request));
    }

    @GetMapping("/me")
    public ResponseEntity<UserProfileResponse> getProfile(){
        Long userId = 1L; 
        return ResponseEntity.ok(userService.getProfile(userId));
    }


        
}


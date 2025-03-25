package com.techtest.filemanagement.app.auth.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techtest.filemanagement.app.auth.model.dto.AuthResponse;
import com.techtest.filemanagement.app.auth.model.dto.LoginRequest;
import com.techtest.filemanagement.app.auth.service.AuthService;
import com.techtest.filemanagement.app.user.model.dto.UserDTO;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;
    @PostMapping(value = "login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request) {
        
        return ResponseEntity.ok(authService.login(request));
    }

    @PostMapping(value ="register")
    public ResponseEntity<AuthResponse> register(@RequestBody UserDTO request) {
        return ResponseEntity.ok(authService.register(request));
    }
    
}

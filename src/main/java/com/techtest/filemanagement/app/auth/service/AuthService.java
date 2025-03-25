package com.techtest.filemanagement.app.auth.service;

import org.springframework.stereotype.Service;

import com.techtest.filemanagement.app.auth.model.dto.AuthResponse;
import com.techtest.filemanagement.app.auth.model.dto.LoginRequest;
import com.techtest.filemanagement.app.user.mapper.UserMapper;
import com.techtest.filemanagement.app.user.model.dto.UserDTO;
import com.techtest.filemanagement.app.user.model.entity.User;
import com.techtest.filemanagement.app.user.repository.UserRepository;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class AuthService {


    private final UserRepository userRepository;
    private final UserMapper userMapper = UserMapper.INSTANCE;
    private final JwtService jwtService;

    public AuthResponse login(LoginRequest request) {
        return null;
    }

    public AuthResponse register(UserDTO userDTO) {
        User user = userMapper.toEntity(userDTO);
        //user.setPasswordHash(passwordEncoder.encode(userDTO.getPasswordHash()));
        userRepository.save(user);
        User savedUser = userRepository.save(user);

        return AuthResponse.builder().token(jwtService.getToken(savedUser)).build();
    }


}

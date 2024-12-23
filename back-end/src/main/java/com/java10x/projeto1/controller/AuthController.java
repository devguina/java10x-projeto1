package com.java10x.projeto1.controller;

import com.java10x.projeto1.controller.DTO.Mapper.UserMapper;
import com.java10x.projeto1.controller.DTO.request.UserRequest;
import com.java10x.projeto1.controller.DTO.response.UserResponse;
import com.java10x.projeto1.entity.User;
import com.java10x.projeto1.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.mapper.Mapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<UserResponse> register(@Valid @RequestBody UserRequest userRequest){
        User saved = userService.save(UserMapper.toUser(userRequest));
        return ResponseEntity.status(HttpStatus.CREATED).body(UserMapper.toUserResponse(saved));
    }
    
}

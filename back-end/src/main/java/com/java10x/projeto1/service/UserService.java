package com.java10x.projeto1.service;

import com.java10x.projeto1.entity.User;
import com.java10x.projeto1.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User save(User user){
        return userRepository.save(user);
    }
}

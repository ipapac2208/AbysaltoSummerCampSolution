package com.example.demo.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.user;
import com.example.demo.repositories.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public List<user> getAllUsers() {
        return userRepository.findAll();
    }
}

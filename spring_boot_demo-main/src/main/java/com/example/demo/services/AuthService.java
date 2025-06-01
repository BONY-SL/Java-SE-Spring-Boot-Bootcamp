package com.example.demo.services;

import com.example.demo.dto.LoginRequestDTO;
import com.example.demo.dto.RegisterRequestDTO;
import jakarta.validation.Valid;

public interface AuthService {
    String register(@Valid RegisterRequestDTO request);

    String login(@Valid LoginRequestDTO request);
}

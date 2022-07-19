package com.tmax.ai.service;

import com.tmax.ai.dto.request.LoginRequestDto;
import com.tmax.ai.entity.User;
import com.tmax.ai.exception.LogInFailedException;
import com.tmax.ai.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class LogInService {

    private final UserRepository userRepository;

    public void logIn(LoginRequestDto loginRequestDto) {
        User user = userRepository.findByUsername(loginRequestDto.getUsername());
        if (!user.getPassword().equals(loginRequestDto.getPassword())) {
            throw new LogInFailedException();
        }
    }
}

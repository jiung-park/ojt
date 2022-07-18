package com.tmax.ai.service;

import com.tmax.ai.dto.LoginRequestDto;
import com.tmax.ai.entity.User;
import com.tmax.ai.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class LogInService {

    private final UserRepository userRepository;

    public void logIn(LoginRequestDto loginRequestDto) {
        User user = userRepository.findByUsername(loginRequestDto.getUsername());
        if(user.getUsername().equals(loginRequestDto.getUsername()) & user.getPassword().equals(loginRequestDto.getPassword())){
            System.out.println("log in success");
            return;
        }
        else {
            System.out.println("log in failed");
        }
    }

}



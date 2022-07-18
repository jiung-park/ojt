package com.tmax.ai.service;

import com.tmax.ai.dto.SignUpRequestDto;
import com.tmax.ai.entity.User;
import com.tmax.ai.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SignUpService {

    private final UserRepository userRepository;

    public void signUp(SignUpRequestDto signUpRequestDto) {
        if (userRepository.existsByUsername(signUpRequestDto.getUsername())) {
            System.out.println("failed");
            return;
        }
        User user = new User();
        System.out.println(user);
        user.setUsername(signUpRequestDto.getUsername());
        user.setPassword(signUpRequestDto.getPassword());
        userRepository.save(user);
        System.out.println("success");
    }

}

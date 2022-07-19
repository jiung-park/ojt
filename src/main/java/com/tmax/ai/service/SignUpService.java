package com.tmax.ai.service;

import com.tmax.ai.dto.request.SignUpRequestDto;
import com.tmax.ai.entity.User;
import com.tmax.ai.exception.DuplicateUsernameException;
import com.tmax.ai.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SignUpService {

    private final UserRepository userRepository;

    public void signUp(SignUpRequestDto signUpRequestDto) {
        if (userRepository.existsByUsername(signUpRequestDto.getUsername())) {
            throw new DuplicateUsernameException(); // 중복된 username 예외 처리
        }
        User user = new User(signUpRequestDto.getUsername(), signUpRequestDto.getPassword());
        userRepository.save(user);
    }

}

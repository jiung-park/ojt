package com.tmax.ai.service;

import com.tmax.ai.dto.request.LoginRequestDto;
import com.tmax.ai.dto.request.SignUpRequestDto;
import com.tmax.ai.entity.User;
import com.tmax.ai.exception.LogInFailedException;
import com.tmax.ai.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class LogInServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private LogInService logInService;

    @Test
    @DisplayName("로그인 실패 예외 처리")
    void loginFailed() throws Exception {
        // given
        LoginRequestDto logInRequestDto = new LoginRequestDto("1L", "1L");

        // when
        when(userRepository.findByUsername(any())).thenReturn(new User("1L", "2L"));

        // then
        Assertions.assertThrows(LogInFailedException.class, ()->logInService.logIn(logInRequestDto));
    }

}

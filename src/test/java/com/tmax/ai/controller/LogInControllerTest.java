package com.tmax.ai.controller;

import com.tmax.ai.dto.request.LoginRequestDto;
import com.tmax.ai.service.LogInService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class LogInControllerTest {

    @Mock
    private LogInService logInService;

    @InjectMocks
    private LogInController logInController;

    @Test
    @DisplayName("회원 로그인 성공")
    void doLogIn() throws Exception {
        // given
        LoginRequestDto loginRequestDto = new LoginRequestDto("1L", "1L");

        // when
        ResponseEntity response = logInController.logIn(loginRequestDto);

        // then
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }

}

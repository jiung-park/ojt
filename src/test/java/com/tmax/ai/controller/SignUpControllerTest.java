package com.tmax.ai.controller;

import com.tmax.ai.dto.request.SignUpRequestDto;
import com.tmax.ai.service.SignUpService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class) // 사용 이유 알기
public class SignUpControllerTest {

    @Mock
    private SignUpService signUpService;

    @InjectMocks
    private SignUpController signUpController;


    @Test
    @DisplayName("회원 생성 성공")
    void signUpUser() throws Exception { // throws 사용 이유?
        // given
        SignUpRequestDto signUpRequestDto = new SignUpRequestDto("1L", "1L");

        // when
        ResponseEntity<Void> response = signUpController.signUp(signUpRequestDto);

        // then
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }

}

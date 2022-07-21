package com.tmax.ai.service;

import com.tmax.ai.dto.request.SignUpRequestDto;
import com.tmax.ai.exception.DuplicateUsernameException;
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
public class SignUpServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private SignUpService signUpService;

    @Test
    @DisplayName("중복된 회원 예외 처리")
    void duplicateUsername() throws Exception {
        // given
        SignUpRequestDto signUpRequestDto = new SignUpRequestDto("1L", "1L");

        // when
        when(userRepository.existsByUsername(any())).thenReturn(true);

        // then
        Assertions.assertThrows(DuplicateUsernameException.class, ()->signUpService.signUp(signUpRequestDto));
    }

}

package com.tmax.ai.controller;

import com.tmax.ai.dto.request.TestRequestDto;
import com.tmax.ai.service.TestService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@ExtendWith(MockitoExtension.class)
public class TestControllerTest {

    @Mock
    private TestService testService;

    @InjectMocks
    private TestController testController;

    @Test
    @DisplayName("테스트 성공")
    void doTest() throws Exception {
        // given
        TestRequestDto testRequestDto = new TestRequestDto("1L", "1+1=2");

        // when
        ResponseEntity response = testController.test(testRequestDto);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.getStatusCode());
    }

}

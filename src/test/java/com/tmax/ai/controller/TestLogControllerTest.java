package com.tmax.ai.controller;

import com.tmax.ai.dto.request.TestLogRequestDto;
import com.tmax.ai.dto.response.TestLogDto;
import com.tmax.ai.dto.response.TestLogResponseDto;
import com.tmax.ai.service.TestLogService;
import org.apache.coyote.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TestLogControllerTest {

    @Mock
    private TestLogService testLogService;

    @InjectMocks
    private TestLogController testLogController;

    @Test
    @DisplayName("테스트 로그 조회 성공")
    void getTestLog() throws Exception {
        // given
        TestLogRequestDto testLogRequestDto = new TestLogRequestDto("1L");
        TestLogDto testLogDto = new TestLogDto("1+1=2",true);
        TestLogResponseDto testLogResponseDto = new TestLogResponseDto();
        testLogResponseDto.AppendTestLogList(testLogDto);

        // when
        when(testLogService.getTestLog(any())).thenReturn(testLogResponseDto);
        ResponseEntity response = testLogController.testLog(testLogRequestDto);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.getStatusCode());
    }

}

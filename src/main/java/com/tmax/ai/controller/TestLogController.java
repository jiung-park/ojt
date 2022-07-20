package com.tmax.ai.controller;

import com.tmax.ai.dto.request.TestLogRequestDto;
import com.tmax.ai.dto.response.TestLogDto;
import com.tmax.ai.dto.response.TestLogResponseDto;
import com.tmax.ai.service.TestLogService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test-log")
public class TestLogController {

    private final TestLogService testLogService;

    @GetMapping
    public ResponseEntity<List<TestLogDto>> testLog(@RequestBody @Valid TestLogRequestDto testLogRequestDto) {
        TestLogResponseDto testLogResponseDto = testLogService.getTestLog(testLogRequestDto);
        return ResponseEntity.ok(testLogResponseDto.getTestLogList());
    }

}

package com.tmax.ai.controller;

import com.tmax.ai.dto.TestLogRequestDto;
import com.tmax.ai.service.TestLogService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/testlog")
public class TestLogController {

    private final TestLogService testLogService;

    @GetMapping
    public ResponseEntity<Void> testLog(@RequestBody TestLogRequestDto testLogRequestDto) {
        testLogService.getTestLog(testLogRequestDto);
        return ResponseEntity.ok().build();
    }

}

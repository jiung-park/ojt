package com.tmax.ai.controller;

import com.tmax.ai.dto.request.TestRequestDto;
import com.tmax.ai.dto.response.TestResponseDto;
import com.tmax.ai.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class TestController {

    private final TestService testService;

    @PostMapping
    public ResponseEntity<TestResponseDto> test(@RequestBody @Valid TestRequestDto testRequestDto) {
        TestResponseDto testResponseDto = testService.test(testRequestDto);
        return ResponseEntity.ok(testResponseDto);
    }

}

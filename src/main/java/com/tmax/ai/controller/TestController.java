package com.tmax.ai.controller;

import com.tmax.ai.dto.request.TestRequestDto;
import com.tmax.ai.dto.response.TestResponseDto;
import com.tmax.ai.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class TestController {

    private final TestService testService;

    @GetMapping
    public ResponseEntity<TestResponseDto> test(@RequestBody @Valid TestRequestDto testRequestDto) {
        TestResponseDto testResponseDto = testService.test(testRequestDto);
        return ResponseEntity.ok(testResponseDto);
    }

}

package com.tmax.ai.controller;

import com.tmax.ai.dto.TestRequestDto;
import com.tmax.ai.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class TestController {

    private final TestService testService;

    @GetMapping
    public ResponseEntity<Void> test(@RequestBody TestRequestDto testRequestDto) throws Exception{
        testService.test(testRequestDto);
        return ResponseEntity.ok().build();
    }

}

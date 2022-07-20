package com.tmax.ai.controller;

import com.tmax.ai.dto.request.LoginRequestDto;
import com.tmax.ai.service.LogInService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/log-in")
public class LogInController {

    private final LogInService logInService;

    @GetMapping
    public ResponseEntity<Void> logIn(@RequestBody @Valid LoginRequestDto loginRequestDto) {
        logInService.logIn(loginRequestDto);
        return ResponseEntity.ok().build();
    }

}

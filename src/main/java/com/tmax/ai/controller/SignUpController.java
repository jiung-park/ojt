package com.tmax.ai.controller;

import com.tmax.ai.dto.SignUpRequestDto;
import com.tmax.ai.service.SignUpService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/signup")
public class SignUpController {

    private final SignUpService signUpService;

    @PostMapping
    public ResponseEntity<Void> signUp(@RequestBody SignUpRequestDto signUpRequestDto) { // ResponseEntity 사용 이유
        signUpService.signUp(signUpRequestDto);
        return ResponseEntity.ok().build(); // Question build() 사용 이유
    } // 중복시 ResponseEntity를 어떻게 줄지 고민 필요

}

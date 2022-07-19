package com.tmax.ai.controller;

import com.tmax.ai.dto.request.SignUpRequestDto;
import com.tmax.ai.service.SignUpService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/sign-up") // 공통 Path는 RequestMapping 사용, 띄어쓰기 '-' 사용
public class SignUpController {

    private final SignUpService signUpService;

    @PostMapping
    public ResponseEntity<Void> signUp(@RequestBody @Valid SignUpRequestDto signUpRequestDto) { // Valid 어노테이션 사용하여 객체 유효성 검사
        signUpService.signUp(signUpRequestDto);
        return ResponseEntity.ok().build();
    }

}

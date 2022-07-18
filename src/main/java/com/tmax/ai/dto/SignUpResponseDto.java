package com.tmax.ai.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class SignUpResponseDto {

    private String message;

    public SignUpResponseDto(String message) {
        this.message = message;
    }
}

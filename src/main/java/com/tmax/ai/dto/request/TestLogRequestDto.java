package com.tmax.ai.dto.request;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.Size;

@Getter
@RequiredArgsConstructor
public class TestLogRequestDto {

    @Size(max=255) // 255자 제한
    private String username;

}

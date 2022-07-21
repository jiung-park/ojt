package com.tmax.ai.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@AllArgsConstructor
public class TestRequestDto {

    @NotBlank
    @Size(max=255) // 255자 제한
    private String username;
    @Size(max=255) // 255자 제한
    private String formula;
    
}

package com.tmax.ai.dto.request;

import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Getter
public class TestRequestDto {

    @NotBlank
    private String username;
    private String formula;
    
}

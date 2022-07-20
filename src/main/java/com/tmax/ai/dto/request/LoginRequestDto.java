package com.tmax.ai.dto.request;

import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
public class LoginRequestDto {

    @NotBlank // 공백 및 null 제한
    @Size(max=255) // 255자 제한
    private String username;
    @NotNull
    @Size(max=255) // 255자 제한
    private String password;

}

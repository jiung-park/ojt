package com.tmax.ai.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter // Q) 일반적으로 DTO에 NoArgsConstructor, Builder 쓰는 이유?
@AllArgsConstructor
public class SignUpRequestDto {

    @NotBlank // 공백 및 null 제한
    @Size(max=255) // 255자 제한
    private String username;
    @NotNull
    @Size(max=255) // 255자 제한
    private String password;

}

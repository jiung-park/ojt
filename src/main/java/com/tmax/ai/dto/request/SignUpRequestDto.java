package com.tmax.ai.dto.request;

import com.sun.istack.NotNull;
import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter // Q) 일반적으로 DTO에 NoArgsConstructor, Builder 쓰는 이유?
public class SignUpRequestDto {

    @NotBlank // 공백 및 null 제한
    @Size(min=1, max=255) // 255자 제한
    private String username;
    @NotNull
    private String password;

}

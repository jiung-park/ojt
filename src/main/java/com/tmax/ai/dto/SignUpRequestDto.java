package com.tmax.ai.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor //Question 빈 생성자가 필요한 이유
public class SignUpRequestDto {

    private String username;
    private String password;

}

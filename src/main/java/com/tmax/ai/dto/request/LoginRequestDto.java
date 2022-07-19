package com.tmax.ai.dto.request;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class LoginRequestDto {

    private String username;
    private String password;

}

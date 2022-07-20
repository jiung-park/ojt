package com.tmax.ai.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TestLogDto {

    private String formula;
    private Boolean isCorrect;

}

package com.tmax.ai.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Getter
@AllArgsConstructor // 모든 컴비네이션 Consturctor 인가?
public class TestResponseDto {

    private Boolean isCorrect;
    @JsonInclude(JsonInclude.Include.NON_NULL) // null인 경우 json 반환시 제거
    private Integer correctAnswer;

}

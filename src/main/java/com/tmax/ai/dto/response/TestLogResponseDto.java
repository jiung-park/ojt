package com.tmax.ai.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class TestLogResponseDto {

    private List<TestLogDto> testLogList;

    public TestLogResponseDto() {
        this.testLogList = new ArrayList<>();
    }

    public void AppendTestLogList(TestLogDto testLogDto) {
        this.testLogList.add(testLogDto);
    }

}

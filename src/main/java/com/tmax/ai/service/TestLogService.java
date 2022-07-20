package com.tmax.ai.service;

import com.tmax.ai.dto.request.TestLogRequestDto;
import com.tmax.ai.dto.response.TestLogDto;
import com.tmax.ai.dto.response.TestLogResponseDto;
import com.tmax.ai.entity.Test;
import com.tmax.ai.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TestLogService {

    private final TestRepository testRepository;

    public TestLogResponseDto getTestLog(TestLogRequestDto testLogRequestDto) {
        List<Test> userList = testRepository.findAllByUsername(testLogRequestDto.getUsername());
        TestLogResponseDto testLogResponseDto = new TestLogResponseDto();
        for (Test test : userList) {
            TestLogDto testLogDto = new TestLogDto(test.getTestLog(), test.getIsCorrect());
            testLogResponseDto.AppendTestLogList(testLogDto);
        }
        return testLogResponseDto;
    }

}

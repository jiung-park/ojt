package com.tmax.ai.service;

import com.tmax.ai.dto.TestLogRequestDto;
import com.tmax.ai.entity.Test;
import com.tmax.ai.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TestLogService {

    private final TestRepository testRepository;

    public void getTestLog(TestLogRequestDto testLogRequestDto) {
        List<Test> userList = testRepository.findAllByUsername(testLogRequestDto.getUsername());
        System.out.println(userList.toString());
    }
}

package com.tmax.ai.service;

import com.tmax.ai.dto.request.TestRequestDto;
import com.tmax.ai.dto.response.TestResponseDto;
import com.tmax.ai.entity.Test;
import com.tmax.ai.exception.InvalidFormulaException;
import com.tmax.ai.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

@RequiredArgsConstructor
@Service
public class TestService {

    private final TestRepository testRepository;

    public TestResponseDto test(TestRequestDto testRequestDto) {
        try {
            ScriptEngineManager mgr = new ScriptEngineManager();
            ScriptEngine engine = mgr.getEngineByName("JavaScript");
            String[] expressions = testRequestDto.getFormula().split("=");
            int left = (int) engine.eval(expressions[0]);
            int right = (int) engine.eval(expressions[1]); // right은 필요 없을듯
            boolean isCorrect = left == right;
            Test test = new Test(testRequestDto.getUsername(), testRequestDto.getFormula(), isCorrect);
            testRepository.save(test);

            TestResponseDto testResponseDto = new TestResponseDto(isCorrect, null);
            if(!isCorrect) {
                testResponseDto = new TestResponseDto(isCorrect, left);
            }
            return testResponseDto;
        } catch(Exception e) {
            throw new InvalidFormulaException();
        }
    }

}

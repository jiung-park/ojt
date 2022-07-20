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
            Float left = Float.valueOf(engine.eval(expressions[0]).toString());
            Float right = Float.valueOf(engine.eval(expressions[1]).toString()); // right은 필요 없을듯
            boolean isCorrect = left.floatValue() == right.floatValue(); // object 사용으로 문제점 발생
            Test test = new Test(testRequestDto.getUsername(), testRequestDto.getFormula(), isCorrect);
            testRepository.save(test);

            TestResponseDto testResponseDto = new TestResponseDto(isCorrect, null);
            if(!isCorrect) {
                testResponseDto = new TestResponseDto(isCorrect, left);
            }
            return testResponseDto;
        } catch(Exception e) { // Exception 수정 필요
            throw new InvalidFormulaException();
        }
    }

}

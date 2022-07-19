package com.tmax.ai.service;

import com.tmax.ai.dto.TestRequestDto;
import com.tmax.ai.entity.Test;
import com.tmax.ai.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

@RequiredArgsConstructor
@Service
public class TestService {

    private final TestRepository testRepository;

    public void test(TestRequestDto testRequestDto) throws Exception {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        String formula = testRequestDto.getFormula();
        String[] expressions = formula.split("=");
        int left = (int) engine.eval(expressions[0]);
        int right = (int) engine.eval(expressions[1]);
        String iscorrect = "false";
        if(left == right) {
            System.out.println("test success");
            iscorrect = "true";
        }
        else {
            System.out.println("test failed");
        }

        // test log 저장

        Test test = new Test();

        test.setUsername(testRequestDto.getUsername()); // Question 두 번 사용되면 미리 변수 받아야 하나
        test.setTestlog(testRequestDto.getFormula());
        test.setIscorrect(iscorrect);

        testRepository.save(test);
    }

}

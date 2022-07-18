package com.tmax.ai.service;

import com.tmax.ai.dto.TestRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

@RequiredArgsConstructor
@Service
public class TestService {

    public void test(TestRequestDto testRequestDto) throws Exception {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        String formula = testRequestDto.getFormula();
        String[] expressions = formula.split("=");
        int left = (int) engine.eval(expressions[0]);
        int right = (int) engine.eval(expressions[1]);
        if(left == right) {
            System.out.println("test success");
        }
        else {
            System.out.println("test failed");
        }
    }

}

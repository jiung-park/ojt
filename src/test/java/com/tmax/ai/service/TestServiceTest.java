package com.tmax.ai.service;

import com.tmax.ai.dto.request.TestRequestDto;
import com.tmax.ai.exception.InvalidFormulaException;
import com.tmax.ai.repository.TestRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class TestServiceTest {

    @Mock
    private TestRepository testRepository;

    @InjectMocks
    private TestService testService;

    @Test
    @DisplayName("불가한 계산식 예외 처리")
    void invalidFormula() throws Exception {
        // given
        TestRequestDto testRequestDto = new TestRequestDto("1L", "abc");

        // then
        assertThrows(InvalidFormulaException.class, ()-> testService.test(testRequestDto));
    }
}

package com.serdar.calculator.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.serdar.calculator.entity.CustomRequest;
import com.serdar.calculator.service.ArithmeticServiceImpl;

@ExtendWith(MockitoExtension.class)
public class ArithmeticControllerTest {

    @Mock
    private ArithmeticServiceImpl mockService;

    private CustomRequest customRequest;

    @Test
    public void testProcess() {
        ArithmeticController controller = new ArithmeticController(mockService);

        // Given
        customRequest = new CustomRequest();
        customRequest.setFirstNumber(new BigDecimal("3.123456789"));
        customRequest.setSecondNumber(new BigDecimal("4.123456789"));
        customRequest.setOperation('+');

        // When
        when(mockService.calculate(customRequest)).thenReturn("7.246913578");
        String result = controller.process(customRequest);

        // Then
        assertEquals("7.246913578", result);
    }
}

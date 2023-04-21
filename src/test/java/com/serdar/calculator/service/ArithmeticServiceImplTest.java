package com.serdar.calculator.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import com.serdar.calculator.entity.CustomRequest;
import com.serdar.calculator.exception.BadRequestException;

@ExtendWith(MockitoExtension.class)
public class ArithmeticServiceImplTest {

    private CustomRequest testCustomRequest;
    
    @InjectMocks
    private ArithmeticServiceImpl arithmeticServiceImpl;

    @BeforeEach
    void setUp() {
        testCustomRequest = new CustomRequest();
        testCustomRequest.setFirstNumber(new BigDecimal("3.123456789"));
        testCustomRequest.setSecondNumber(new BigDecimal("4.123456789"));
    }

    @Test
    void testCalculateSumOperationSuccess() {
        // Given
        testCustomRequest.setOperation('+');

        // When
        String result = arithmeticServiceImpl.calculate(testCustomRequest);

        // Then
        assertEquals("7.246913578", result);
    }

    @Test
    void testCalculateSumInvalidOperation() {
        // Given
        testCustomRequest.setOperation('s');

        // When
        BadRequestException exp = assertThrows(BadRequestException.class, () -> {
            arithmeticServiceImpl.calculate(testCustomRequest);
        });
        
        // Then
        assertEquals(exp.getMessage(), "Operation is not valid. Accepted operations are + and -");
    }

    @Test
    void testCalculateSubtractOperationSuccess() {
        // Given
        testCustomRequest.setOperation('-');

        // When
        String result = arithmeticServiceImpl.calculate(testCustomRequest);

        // Then
        assertEquals("-1.000000000", result);
    }
}

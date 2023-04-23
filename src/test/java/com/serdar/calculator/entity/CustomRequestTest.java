package com.serdar.calculator.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CustomRequestTest {

    private CustomRequest customRequest;

    @BeforeEach
    void setUp() {
        customRequest = new CustomRequest();
        customRequest.setFirstNumber(new BigDecimal("3.123456789"));
        customRequest.setSecondNumber(new BigDecimal("4.123456789"));
    }

    @Test
    void testCustomRequest() {
        // Given
        customRequest.setFirstNumber(new BigDecimal("5.123456789"));
        customRequest.setSecondNumber(new BigDecimal("10.123456789"));

        // When, Then
        assertEquals("5.123456789", customRequest.getFirstNumber().toString());
        assertEquals("10.123456789", customRequest.getSecondNumber().toString());
        assertEquals(
                "CustomRequest(firstNumber=5.123456789, secondNumber=10.123456789)",
                customRequest.toString());
    }
}

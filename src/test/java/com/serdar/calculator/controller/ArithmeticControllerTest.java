package com.serdar.calculator.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import com.serdar.calculator.entity.CustomRequest;

@ExtendWith(MockitoExtension.class)
public class ArithmeticControllerTest {

    private CustomRequest customRequest;
    private ArithmeticController controller;

    @BeforeEach
    void setup() {
        controller = new ArithmeticController();
    }

    @Test
    public void testSum() {
        // Given
        customRequest = new CustomRequest();
        customRequest.setFirstNumber(new BigDecimal("3.123456789"));
        customRequest.setSecondNumber(new BigDecimal("4.123456789"));

        // When
        String result = controller.sum(customRequest);

        // Then
        assertEquals("7.246913578", result);
    }

    @Test
    public void testSubtract() {
        // Given
        customRequest = new CustomRequest();
        customRequest.setFirstNumber(new BigDecimal("3.123456789"));
        customRequest.setSecondNumber(new BigDecimal("4.987654321"));

        // When
        String result = controller.subtract(customRequest);

        // Then
        assertEquals("-1.864197532", result);
    }
}

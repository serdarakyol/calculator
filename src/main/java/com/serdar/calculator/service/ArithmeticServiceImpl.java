package com.serdar.calculator.service;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.serdar.calculator.entity.CustomRequest;
import com.serdar.calculator.utils.Utils;

@Service
public class ArithmeticServiceImpl implements ArithmeticService {

    private final List<Character> operations = Arrays.asList(new Character[]{'+', '-'});

    @Override
    public BigDecimal calculate(CustomRequest customRequest) {
        String firstNumber = customRequest.firstNumber;
        String secondNumber = customRequest.secondNumber;
        Character operation = customRequest.operation;
        if (!operations.contains(operation)) {
            // TODO: Return bad request
        }
        if (!Utils.isNumericValue(firstNumber)) {
            // TODO: Return bad request
        }
        BigDecimal fNumber = BigDecimal.valueOf(Double.valueOf(firstNumber));
        BigDecimal sNumber = BigDecimal.valueOf(Double.valueOf(secondNumber));
        return fNumber.add(sNumber);
    }
}

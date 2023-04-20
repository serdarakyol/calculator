package com.serdar.calculator.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.serdar.calculator.entity.CustomRequest;
import com.serdar.calculator.utils.Utils;

@Service
public class ArithmeticServiceImpl implements ArithmeticService {

    @Override
    public BigDecimal calculate(CustomRequest customRequest) {
        String firstNumber = customRequest.firstNumber;
        String secondNumber = customRequest.secondNumber;
        if (!Utils.isNumericValue(firstNumber)) {
            // TODO: Return bad request
        }
        BigDecimal fNumber = BigDecimal.valueOf(Double.valueOf(firstNumber));
        BigDecimal sNumber = BigDecimal.valueOf(Double.valueOf(secondNumber));
        return fNumber.add(sNumber);
    }
}

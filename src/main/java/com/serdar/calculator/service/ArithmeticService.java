package com.serdar.calculator.service;

import java.math.BigDecimal;

import com.serdar.calculator.entity.CustomRequest;

public interface ArithmeticService {
    public BigDecimal calculate(CustomRequest customRequest);
}

package com.serdar.calculator.service;

import com.serdar.calculator.entity.CustomRequest;

class Sum implements ArithmeticService {

    @Override
    public String calculate(CustomRequest customRequest) {
        return customRequest.firstNumber.add(customRequest.secondNumber).toString();
    }
}

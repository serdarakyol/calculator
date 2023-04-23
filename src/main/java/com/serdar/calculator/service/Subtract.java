package com.serdar.calculator.service;

import com.serdar.calculator.entity.CustomRequest;

class Subtract implements ArithmeticService {

    @Override
    public String calculate(CustomRequest customRequest) {
        return customRequest.firstNumber.subtract(customRequest.secondNumber).toString();
    }
    
}

package com.serdar.calculator.service;

import org.springframework.stereotype.Service;

import com.serdar.calculator.entity.CustomRequest;
import com.serdar.calculator.exception.BadRequestException;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class ArithmeticServiceImpl implements ArithmeticService {

    private final String notValidOperationMsg = "Operation is not valid. Accepted operations are + and -";

    @Override
    public String calculate(CustomRequest customRequest) {
        switch (customRequest.operation) {
            case '+':
                return customRequest.firstNumber.add(customRequest.secondNumber).toString();
            case '-':
                return customRequest.firstNumber.subtract(customRequest.secondNumber).toString();
            default:
            log.error(notValidOperationMsg);
                throw new BadRequestException(notValidOperationMsg);
        }
    }
}

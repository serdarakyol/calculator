package com.serdar.calculator.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;
import io.corp.calculator.TracerImpl;
import com.serdar.calculator.entity.CustomRequest;
import com.serdar.calculator.exception.BadRequestException;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class ArithmeticServiceImpl implements ArithmeticService {

    private final String notValidOperationMsg = "Operation is not valid. Accepted operations are + and -";

    @Override
    public String calculate(CustomRequest customRequest) {
        TracerImpl tracer = new TracerImpl();
        BigDecimal result;
        switch (customRequest.operation) {
            case '+':
                result = customRequest.firstNumber.add(customRequest.secondNumber);
                tracer.trace(result);
                return result.toString();
            case '-':
                result = customRequest.firstNumber.subtract(customRequest.secondNumber);
                tracer.trace(result);
                return result.toString();
            default:
            log.error(notValidOperationMsg);
                throw new BadRequestException(notValidOperationMsg);
        }
    }
}

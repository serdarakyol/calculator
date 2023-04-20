package com.serdar.calculator.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.serdar.calculator.entity.CustomRequest;
import com.serdar.calculator.exception.BadRequestException;
import com.serdar.calculator.utils.Utils;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class ArithmeticServiceImpl implements ArithmeticService {

    private final String notValidOperationMsg = "Operation is not valid. Accepted operations are + and -";
    private final String notNumericOrValid = "The numbers are not numeric or not in format. Expected format 5.1234 or 5";

    @Override
    public BigDecimal calculate(CustomRequest customRequest) {
        String firstNumber = customRequest.firstNumber;
        String secondNumber = customRequest.secondNumber;
        Character operation = customRequest.operation;

        // check if values are digit
        if (!Utils.isNumericValue(firstNumber) || !Utils.isNumericValue(secondNumber)) {
            log.error(notNumericOrValid + "your numbers are: " + firstNumber + ", " + secondNumber);
            throw new BadRequestException(notNumericOrValid);
        }
        // get values
        BigDecimal fNumber = BigDecimal.valueOf(Double.valueOf(firstNumber));
        BigDecimal sNumber = BigDecimal.valueOf(Double.valueOf(secondNumber));
        
        switch (operation) {
            case '+':
                return fNumber.add(sNumber);
            case '-':
                return fNumber.subtract(sNumber);
            default:
            log.error(notValidOperationMsg);
                throw new BadRequestException(notValidOperationMsg);
        }
    }
}

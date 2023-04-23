package com.serdar.calculator.service;

import com.serdar.calculator.exception.BadRequestException;

public class ServiceOperation {
    public static ArithmeticService getInstance(OperationType operationType) {
        final String notValidOperationMsg = "Operation is not valid. Accepted operations are + and -";
        switch (operationType) {
            case SUM:
                return new Sum();
            case SUBTRACT:
                return new Subtract();
            default:
                throw new BadRequestException(notValidOperationMsg);
        }
    }

    public enum OperationType {
        SUM,
        SUBTRACT;
    }
}

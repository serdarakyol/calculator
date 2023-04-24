package com.serdar.calculator.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

import com.serdar.calculator.entity.CustomRequest;
import com.serdar.calculator.service.OperationType;
import com.serdar.calculator.service.ServiceOperation;

import io.corp.calculator.TracerImpl;

@RestController
@RequestMapping(path = "api/v1/ArithmeticOperations")
public class ArithmeticController {

    TracerImpl tracer = new TracerImpl();

    @PostMapping(path = "sum")
    @ResponseStatus(HttpStatus.OK)
    public String sum(@RequestBody CustomRequest customRequest) {
        String result = ServiceOperation.getInstance(OperationType.SUM).calculate(customRequest);
        tracer.trace(result);
        return result;
    }

    @PostMapping(path = "subtract")
    @ResponseStatus(HttpStatus.OK)
    public String subtract(@RequestBody CustomRequest customRequest) {
        String result = ServiceOperation.getInstance(OperationType.SUBTRACT).calculate(customRequest);
        tracer.trace(result);
        return result;
    }
}

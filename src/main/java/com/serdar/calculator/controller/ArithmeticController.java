package com.serdar.calculator.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

import com.serdar.calculator.entity.CustomRequest;
import com.serdar.calculator.service.ArithmeticServiceImpl;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping(path = "api/v1/ArithmeticOperations")
public class ArithmeticController {

    public final ArithmeticServiceImpl arithmeticServiceImpl;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public BigDecimal summing(@RequestBody CustomRequest customRequest) {
        return arithmeticServiceImpl.calculate(customRequest);
    }
}

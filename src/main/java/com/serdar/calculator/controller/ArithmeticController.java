package com.serdar.calculator.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/ArithmeticOperations")
public class ArithmeticController {

    @PostMapping
    public String sumNumbers() {
        
        return BodyResponses.ADDITION;
    }

    @PostMapping
    public String subtractNumbers() {
        
        return BodyResponses.SUBTRACTION;
    }
}

package com.serdar.calculator.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/ArithmeticOperations")
public class ArithmeticController {

    @PostMapping(path = "sum")
    public String sumNumbers() {
        
        return BodyResponses.ADDITION;
    }

    @PostMapping(path = "subtract")
    public String subtractNumbers() {
        
        return BodyResponses.SUBTRACTION;
    }
}

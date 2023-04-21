package com.serdar.calculator.entity;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CustomRequest {
    public BigDecimal firstNumber;
    public BigDecimal secondNumber;
    public Character operation;
}

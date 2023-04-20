package com.serdar.calculator.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CustomRequest {
    public String firstNumber;
    public String secondNumber;
    public Character operation;
}

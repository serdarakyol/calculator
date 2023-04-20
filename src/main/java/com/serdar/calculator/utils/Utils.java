package com.serdar.calculator.utils;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;

@Component
public class Utils {
    public static boolean isNumericValue(String strNum) {
        String regex = "-?\\d+(\\.\\d+)?";
        return Pattern.compile(regex).matcher(strNum).matches();
    }
}

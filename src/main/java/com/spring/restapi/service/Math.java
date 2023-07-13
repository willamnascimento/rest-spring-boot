package com.spring.restapi.service;

import com.spring.restapi.exception.DivisionByZeroException;
import com.spring.restapi.exception.UnsuportedMathOperationException;
import org.springframework.stereotype.Service;

@Service
public class Math {
    public Double sum(Double number1, Double number2) {
        return number1 + number2;
    }

    public Double subtraction(Double number1, Double number2) {
        return number1 - number2;
    }

    public Double multiplication(Double number1, Double number2) {
        return number1 * number2;
    }

    public Double division(Double number1, Double number2) {
        if (number2.equals(0.0)){
            throw new DivisionByZeroException("Dividing by zero is not possible. !");
        }
        return number1 / number2;
    }

}

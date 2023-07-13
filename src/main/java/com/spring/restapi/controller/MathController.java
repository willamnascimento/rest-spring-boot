package com.spring.restapi.controller;

import com.spring.restapi.exception.UnsuportedMathOperationException;
import com.spring.restapi.service.Math;
import com.spring.restapi.utils.Converters;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/calculator")
@Tag(name = "Calculator", description = "Calculator with basic operations")
public class MathController {

    @Autowired
    private Math math;

    @Operation(
            summary = "Endpoint that performs the sum of the 2 numbers",
            description = "This endpoint allows you to perform the addition of two numbers.")
    @RequestMapping(value="/sum/{number1}/{number2}", method= RequestMethod.GET)
    public Double sum(@PathVariable("number1") String number1, @PathVariable("number2") String number2) throws Exception {
        if (!Converters.isNumeric(number1) || !Converters.isNumeric(number2)) {
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return math.sum(Converters.covertToDouble(number1), Converters.covertToDouble(number2));
    }

    @Operation(
            summary = "Endpoint that performs the subtraction of the 2 numbers",
            description = "This endpoint enables the subtraction of two numbers.")
    @RequestMapping(value="/subtraction/{number1}/{number2}", method= RequestMethod.GET)
    public Double subtraction(@PathVariable("number1") String number1, @PathVariable("number2") String number2) throws Exception {
        if (!Converters.isNumeric(number1) || !Converters.isNumeric(number2)) {
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return math.subtraction(Converters.covertToDouble(number1), Converters.covertToDouble(number2));
    }

    @Operation(
            summary = "Endpoint that performs the multiplication of the 2 numbers",
            description = "This endpoint allows you to perform the multiplication of two numbers.")
    @RequestMapping(value="/multiplication/{number1}/{number2}", method= RequestMethod.GET)
    public Double multiplication(@PathVariable("number1") String number1, @PathVariable("number2") String number2) throws Exception {
        if (!Converters.isNumeric(number1) || !Converters.isNumeric(number2)) {
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return math.multiplication(Converters.covertToDouble(number1), Converters.covertToDouble(number2));
    }

    @Operation(
            summary = "Endpoint that performs the division of the 2 numbers",
            description = "This endpoint allows you to perform the division of two numbers and it validates if number2 is zero.")
    @RequestMapping(value="/division/{number1}/{number2}", method= RequestMethod.GET)
    public Double division(@PathVariable("number1") String number1, @PathVariable("number2") String number2) throws Exception {
        if (!Converters.isNumeric(number1) || !Converters.isNumeric(number2)) {
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return math.division(Converters.covertToDouble(number1), Converters.covertToDouble(number2));
    }
}

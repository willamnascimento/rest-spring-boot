package com.spring.restapi;

import com.spring.restapi.exception.DivisionByZeroException;
import com.spring.restapi.exception.UnsuportedMathOperationException;
import com.spring.restapi.service.Math;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MathTest {

    private Math math;

    @BeforeEach
    public void setUp() {
        math = new Math();
    }

    @Test
    public void testSum() {
        Double result = math.sum(5.0, 3.0);
        Assertions.assertEquals(8.0, result);
    }

    @Test
    public void testSubtraction() {
        Double result = math.subtraction(5.0, 3.0);
        Assertions.assertEquals(2.0, result);
    }

    @Test
    public void testMultiplication() {
        Double result = math.multiplication(5.0, 3.0);
        Assertions.assertEquals(15.0, result);
    }

    @Test
    public void testDivision() {
        Double result = math.division(10.0, 2.0);
        Assertions.assertEquals(5.0, result);
    }

    @Test
    public void testDivisionByZero() {
        Assertions.assertThrows(DivisionByZeroException.class, () -> {
            math.division(10.0, 0.0);
        });
    }
}


package com.spring.restapi;

import com.spring.restapi.exception.DivisionByZeroException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivisionByZeroExceptionTest {

    @Test
    public void testDivisionByZeroException() {
        String exceptionMessage = "Dividing by zero is not possible!";
        DivisionByZeroException exception = Assertions.assertThrows(DivisionByZeroException.class, () -> {
            throw new DivisionByZeroException(exceptionMessage);
        });

        Assertions.assertEquals(exceptionMessage, exception.getMessage());
    }
}


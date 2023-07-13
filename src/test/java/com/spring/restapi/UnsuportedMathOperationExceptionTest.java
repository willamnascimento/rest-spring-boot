package com.spring.restapi;

import com.spring.restapi.exception.UnsuportedMathOperationException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UnsuportedMathOperationExceptionTest {

    @Test
    public void testUnsuportedMathOperationException() {
        String exceptionMessage = "Unsupported math operation!";
        UnsuportedMathOperationException exception = Assertions.assertThrows(UnsuportedMathOperationException.class, () -> {
            throw new UnsuportedMathOperationException(exceptionMessage);
        });

        Assertions.assertEquals(exceptionMessage, exception.getMessage());
    }
}


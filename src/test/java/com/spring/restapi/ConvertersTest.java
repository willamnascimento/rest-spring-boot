package com.spring.restapi;

import com.spring.restapi.utils.Converters;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConvertersTest {

    @Test
    public void testConvertToDouble() {
        String strNumber = "10.5";
        Double result = Converters.covertToDouble(strNumber);
        Assertions.assertEquals(10.5, result);
    }

    @Test
    public void testConvertToDoubleWithNull() {
        Double result = Converters.covertToDouble(null);
        Assertions.assertEquals(0d, result);
    }

    @Test
    public void testConvertToDoubleWithNonNumericString() {
        String strNumber = "abc";
        Double result = Converters.covertToDouble(strNumber);
        Assertions.assertEquals(0d, result);
    }

    @Test
    public void testIsNumeric() {
        Assertions.assertTrue(Converters.isNumeric("10.5"));
        Assertions.assertTrue(Converters.isNumeric("-123"));
        Assertions.assertFalse(Converters.isNumeric("abc"));
    }

    @Test
    public void testIsNumericWithNull() {
        Assertions.assertFalse(Converters.isNumeric(null));
    }
}


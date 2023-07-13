package com.spring.restapi.utils;

public class Converters {

    public static Double covertToDouble(String strNumber) {
        if (strNumber == null){
            return 0d;
        }
        var number = strNumber.replaceAll(",", ".");
        if (isNumeric(number)) {
            return Double.parseDouble(number);
        }
        return 0d;
    }

    public static boolean isNumeric(String strNumber) {
        if (strNumber == null){
            return false;
        }
        var number = strNumber.replaceAll(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}

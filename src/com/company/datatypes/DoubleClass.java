package com.company.datatypes;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DoubleClass {
    public static void main(String[] args) {
        // Rounding-off a 'double' variable to certain decimal places. 
        Double value = 3.5789055 ;
        Double roundedOffValue = BigDecimal.valueOf(value)
                .setScale(3 /* Number of decimal places */, RoundingMode.HALF_UP)
                .doubleValue() ; // Rounded-off value.
        System.out.println("roundedOffValue = " + roundedOffValue);

        // Printing the 'double' value till only 2 decimal places which is specified by '%.2f', as follows.
        System.out.printf("%.2f", value) ;
    }
}

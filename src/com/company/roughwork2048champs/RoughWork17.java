package com.company.roughwork2048champs;

import java.text.DecimalFormat;

public class RoughWork17 {
    public static void main(String[] args) {
        long value = 1;
        int powerOfTwo = 0;
        while (powerOfTwo <= 61) {
            value = value * 2;
            powerOfTwo++;
            System.out.println("CELL_VALUE_" + powerOfTwo + "_" + value + "(" + value +
                    "L, R.color.game_tile_number_color_light, R.color.background_color_" + powerOfTwo + "_" + value +
                    ", R.drawable.cell_value_" + powerOfTwo + "_" + value + "),");

            System.out.println("<color name=\"background_color_" + powerOfTwo + "_" + value + "\">#000000</color>");
            System.out.println("else if (cellValue == " + value + "L) { return valueOf(\"CELL_VALUE_" +
                    powerOfTwo + "_" + value + "\"); }");

            System.out.print("else if (cellValue == " + value + "L) { // Base = 2, Index (Power) = " +
                    powerOfTwo + ", Expression = 2 ^ " + powerOfTwo + "\n");
            DecimalFormat decimalFormat = new DecimalFormat("#,###");
            System.out.println("    // Value = " + decimalFormat.format(value));
            System.out.println("    return \"2\";");
            System.out.print("} ");

            DecimalFormat decimalFormatCopy = new DecimalFormat("#,###");
            System.out.println("gameTileValueToFormattedString.put(" + value + "L, \"" + NumericValueDisplay.getFormattedString(value)
                    + "\"); // Formatted Value = " + decimalFormatCopy.format(value));


            System.out.println("PowerOfTwo = " + powerOfTwo + ", Key = " + value +
                    ", Value = " + NumericValueDisplay.getFormattedString(value));
        }
    }
}

package com.company.roughwork2048champs;

public class RoughWork15 {
    // The following code is useful for creating the lines of code in CellValues.java in our main project
    public static void main(String[] args) {
        long value = 1;
        int powerOfTwo = 0;
        while (powerOfTwo <= 61) {
            value = value * 2;
            powerOfTwo++;
            System.out.println("CELL_VALUE_" + powerOfTwo + "_" + value + "(" + value +
                    "L, R.color.game_tile_number_color_light, R.color.background_color_" + powerOfTwo + "_" + value +
                    ", R.drawable.cell_value_" + powerOfTwo + "_" + value + "),");
            /*
            System.out.println("<color name=\"background_color_" + powerOfTwo + "_" + value + "\">#000000</color>");
            System.out.println("else if (cellValue == " + value + "L) { return valueOf(\"CELL_VALUE_" +
                    powerOfTwo + "_" + value + "\"); }");
            */
        }
    }
}

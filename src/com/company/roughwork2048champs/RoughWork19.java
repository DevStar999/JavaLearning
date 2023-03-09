package com.company.roughwork2048champs;

public class RoughWork19 {
    public static void main(String[] args) {
        /** Roughwork for determining the Max. Possible Game Score (Which we want to allow) **/
        long maxLongValue = 9223372036854775807L;
        long maxPossibleGameScore = 9200000000000000000L; // Value = 9200 X (10 ^ 15) = 9200Q
        // Q = Quadrillion i.e. 10 ^ 15

        /** Testing of the code in the class NumericValueDisplay **/
        long score = 1987654321987654321L;
        System.out.println("Formatted score = " + NumericValueDisplay.getScoreValueDisplay(score));

        long base = 10, index = 4;
        System.out.println("Base = " + base + ", Index = " + index + ", Expression = " + base + " ^ " + index + " = " +
                NumericValueDisplay.powerOf(base, index));
    }
}

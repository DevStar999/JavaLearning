package com.company.gui;

import javax.swing.JOptionPane;

public class BasicCalculator {
    public static void main(String[] args) {
        String firstNumber = JOptionPane.showInputDialog("Enter the first number -");
        String secondNumber = JOptionPane.showInputDialog("Enter the second number -");

        int num1 = Integer.parseInt(firstNumber), num2 = Integer.parseInt(secondNumber);
        int sum = num1 + num2;

        JOptionPane.showMessageDialog(null, "The sum = " + sum,
                "The Sum of 2 Numbers", JOptionPane.PLAIN_MESSAGE);
    }
}

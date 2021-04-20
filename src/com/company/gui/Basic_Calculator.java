package com.company.gui;

import javax.swing.*;
//import javax.swing.JOptionPane; Importing everything using the above line but this is the specific path.

public class Basic_Calculator {

	public static void main(String[] args) {
		String fnum = JOptionPane.showInputDialog("Enter the first number -") ;
		String snum = JOptionPane.showInputDialog("Enter the second number -") ;
		
		int num1 = Integer.parseInt(fnum) , num2 = Integer.parseInt(snum) ;
		int sum = num1 + num2 ;
		
		JOptionPane.showMessageDialog(null, "The sum = " + sum , "The Sum of 2 Numbers", JOptionPane.PLAIN_MESSAGE) ;
	}

}

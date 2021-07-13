package com.company.rough;

//import java.util.;

import java.util.Random;

public class Rough15 {
    public int a, b;

    public void set_data(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void show_data() {
        System.out.println("a = " + a + " , b = " + b);
    }

    void fun1(int a) {

    }

    int fun1() {
        int a = 10;
        return a;
    }

    public static void main(String[] args) {
        String str = "ag", str1 = "AG";
/*
		int val = str.compareTo(str1) ;
		System.out.println( "val = " + val ) ;
		
		if( str == str1 ){
			System.out.println("Value is Good") ;
		}
		else{
			System.out.println("Value is Different") ;			
		}
*/
        Random dice = new Random();
        int val;

        for (int i = 1; i <= 10; i++) {
            val = 1 + dice.nextInt(6);
			System.out.println(val) ;
        }

        double db = dice.nextDouble() + 10;
		System.out.println("db = " + db) ;
    }

}

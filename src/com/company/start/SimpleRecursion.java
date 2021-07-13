package com.company.start;

public class SimpleRecursion {
    private String prod = "";

    public long fact(long n) {
        if (n <= 1) {
            prod = prod.concat(Integer.toString((int) n) + " ");
            //System.out.println("eval(now) = " + prod);
            return 1;
        } else {
            prod = prod.concat(Integer.toString((int) n) + " * ");
            //System.out.println("eval(now) = " + prod);
            return n * fact(n - 1);
        }
    }

    public long getFact(long n) {
        prod = "";
        return fact(n);
    }

    public static void main(String[] args) {
        SimpleRecursion obj = new SimpleRecursion();
        long ans1 = obj.getFact(7);
        System.out.println("7! = " + obj.prod + " = " + ans1);
        long ans2 = obj.getFact(5);
        System.out.println("5! = " + obj.prod + " = " + ans2);
    }
}

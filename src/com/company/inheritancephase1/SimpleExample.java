package com.company.inheritancephase1;

// Super-Class.
class one {
    public void printOne() {
        System.out.println("Method of class 'one'");
    }
}

// Sub-Class for class 'one'.
class two extends one {
    public void printTwo() {
        System.out.println("Method of class 'two'");
    }
}

public class SimpleExample {
    public static void main(String[] args) {
        two twoObject = new two();
        // Object of class 'two' inheriting the properties of class 'one' namely it's method 'printOne()'.
        twoObject.printOne();
        twoObject.printTwo();

        ProtectedKeywordIP1 obj = new ProtectedKeywordIP1();
        // Since, access modifier for this method is 'protected' it is accessible within the same package.
        obj.displayPkip1();
    }
}

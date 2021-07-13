package com.company.innerclass;

class Utility {
    void show() {
        System.out.println("Inside show() method of super class");
    }
}


public class AnonymousInnerClassEx1 {
    //  An Anonymous Inner Class with 'Test_Utility' as base class i.e. a subclass of specified type. 	
    static Utility utilityObject = new Utility() {
        void show() {
            super.show();
            System.out.println("Inside show() Test class");
        }
    };

    public static void main(String[] args) {
        utilityObject.show();
    }
}

package com.company.inner_class;

class OuterV2 {
    void outerMethod() {
        int val = 100; // Non-final local variable.
        System.out.println("inside outerMethod");
        // Inner class is local to outerMethod() 
        class Inner {
            void innerMethod() {
                System.out.println("inside innerMethod and val = " + val);
                // Using non-final local variable as above. (Allowed since JDK 1.8)
                // Else, only final local variables were allowed to be accessed.
            }
        }
        Inner innerObject = new Inner();
        innerObject.innerMethod();
    }
}


public class MethodLocalInnerClass {
    public static void main(String[] args) {
        OuterV2 outerV2Object = new OuterV2();
        outerV2Object.outerMethod();
    }
}

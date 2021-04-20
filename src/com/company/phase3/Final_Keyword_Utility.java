package com.company.phase3;

public class Final_Keyword_Utility {
	/** About Final Variables **/
    // A final variable, direct initialization. 
    final int THRESHOLD = 5 ; 
      
    // A blank final variable. 
    final int CAPACITY ; 
      
    // A final static variable PI, direct initialization.
    static final double PI = 3.1415 ; 
      
    // A blank final static variable. 
    static final double EULERCONSTANT ; 
      
    // Instance initializer block for initializing CAPACITY. 
    { 
        CAPACITY = 25 ; 
    } 
      
    // Static initializer block for initializing EULERCONSTANT. 
    static{ 
        EULERCONSTANT = 2.3 ; 
    } 
    
    /** About Final Methods - Most commonly used to prevent method overriding **/
    /*
    class A {
        final void m1() {
            System.out.println("This is a final method.");
        }
    }

    class B extends A {
        void m1(){ 
            System.out.println("Illegal!") ; // COMPILE-ERROR! Can't override.
        }
    }
    */
    
    /** About Final Methods - Used to prevent inheritance and make the class immutable **/ 
    /*
    final class A{
         // methods and fields
    }
    // The following class is illegal.
    class B extends A { 
        // COMPILE-ERROR! Can't subclass A
    }
    */
}

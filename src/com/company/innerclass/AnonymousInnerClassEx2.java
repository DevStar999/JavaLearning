package com.company.innerclass;

interface Hello {
    void show();
}


public class AnonymousInnerClassEx2 {
    public static void main(String[] args) {
	    /* 	An Anonymous Inner Class that implements Hello interface i.e. 
		 	as an implementer of the specified interface. 
	    */
        Hello helloObject = new Hello() {
            public void show() {
                System.out.println("i am in anonymous class");
            }
        };

        helloObject.show();
    }
}

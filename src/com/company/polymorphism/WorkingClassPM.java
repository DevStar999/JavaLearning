package com.company.polymorphism;

public class WorkingClassPM {
    // Creating a function having polymorphic arguments.
    static void showMovement(Animal x) {
        x.movement();
    }

    public static void main(String[] args) {
		/*
		In the following line, we see an example where the object can be assigned any sub-class of the
 		super-class of the data-type of the object. Hence, an object of data-type 'Animal'(Super-Class)
 		can hold the entities for that of an 'Eagle'(Sub-Class). This is called Upcasting.
		*/
        Animal eagle1 = new Eagle();

        // Creating a polymorphic array.
        Animal alist[] = new Animal[3];
        alist[0] = new Eagle();
        alist[1] = new Goldfish();
        alist[2] = new Kangaroo();

        /*
        System.out.println("The movement of different animals is shown as follows :");
        for (int i = 0; i < alist.length; i++) {
            alist[i].movement();
        }
        System.out.println();
        */

        System.out.println("Revealing the movement of the given animal as follows :");
        showMovement(new Eagle());
    }
}

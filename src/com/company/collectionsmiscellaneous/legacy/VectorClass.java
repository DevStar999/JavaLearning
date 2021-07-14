package com.company.collectionsmiscellaneous.legacy;

import java.util.ArrayList;
import java.util.Vector;

public class VectorClass {
    public static void printVector(Vector<Integer> vector) {
        System.out.println("The elements of the Vector are as follows : ");
        for (int i = 0; i < vector.size(); i++) {
            System.out.print(vector.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        Vector<Integer> vector1 = new Vector<>();
        Vector<Integer> vector2 = new Vector<>();
        for (int i = 0; i < 10; i++) {
            vector1.add(i);
            arrayList1.add(i + 10);
            vector2.add(i + 50);
        }

        /** Constructors for Vector Class **/
        /* (1) Vector() - Creates a default vector of initial capacity is 10. */
        Vector<Integer> vector3 = new Vector<>();

        /* (2) Vector(int size) - Creates a vector whose initial capacity is specified by size. */
        Vector<Integer> vector4 = new Vector<>(10);
		
		/* (3) Vector(int size, int incr) - Creates a vector whose initial capacity is specified 
			   by size and increment is specified by incr. It specifies the number of elements to 
			   allocate each time that a vector is resized upward. 
		*/
        Vector<Integer> vector5 = new Vector<>(20, 2);

        /* (4) Vector(Collection c) - Creates a vector that contains the elements of collection c. */
        Vector<Integer> vector6 = new Vector<>(arrayList1);

        /** Common Vector Class Methods are follows (Excluding those which were mentioned before) **/
        /* (1) clone() - This method returns a shallow copy of this vector. */
        Vector<Integer> vector1Copy = (Vector<Integer>) vector1.clone();

		/* (2) toString() - The 'toString()' method is used to return a string representation 
			   of this Vector, containing the String representation of each element. 
		*/
        System.out.println("The string representation of 'vector1' is as follows :\n" + vector1.toString());

        /* (3) setSize(int newSize) - This method sets the size. */
        vector3.setSize(7);
				
		/* (4) retainAll(Collection c) - This method retains only the elements in this Vector that are 
			   contained in the specified Collection. 
		*/
        vector1Copy.retainAll(vector1);

        /* (5) int capacity() - This method returns the current capacity of this vector. */
        System.out.println("The capacity of 'vector2' = " + vector2.capacity());
    }
}

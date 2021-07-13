package com.company.phase1;

class Box<T> {
    private T item;

    public void set(T t) {
        this.item = t;
    }

    public T get() {
        return item;
    }
}

public class Generics {
    public static void main(String[] args) {
        Integer int_array[] = {10, 20, 30, 40, 50};
        Character char_array[] = {'V', 'i', 'n', 'a', 'y'};

        // Use of a generic method is done below.
        /*
        printArray(int_array);
        printArray(char_array);
        */

        System.out.println("max(43,12,65) = " + max(43, 12, 65));
        System.out.println("max(\"apples\",\"zebra\") = " + max("apples", "zebra"));

        // Use of the Generic Class 'Box' is done as follows.
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

        integerBox.set(10);
        stringBox.set(new String("Hello World"));

        System.out.printf("Integer Value : %d\n", integerBox.get());
        System.out.printf("String Value : %s\n", stringBox.get());
    }

    // Generic Method.
    public static <T> void printArray(T arr[]) {
        System.out.println("The elements of the array are displayed as follows :");
        for (T counter : arr) {
            System.out.printf("%s ", counter);
        }
        System.out.println();
    }

    // Bounded Type Parameters and Generic Return Type.
    public static <T extends Comparable<T>> T max(T... elements) {
        // Here, we can have variable number of arguments.
        T ans = elements[0];
        for (int i = 1; i < elements.length; i++) {
			/* 	'.compareTo()' returns -1,0 or 1 if the object on which it is called is less, equal or greater 
			 	as compared to the passed parameter object. 
			*/
            if (ans.compareTo(elements[i]) < 0) {
                ans = elements[i];
            }
        }
        return ans;
    }
}

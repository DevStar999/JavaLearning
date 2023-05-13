package com.company.aftergapinterviewprep.part1;

import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class RL03Basics {

    public static void main(String[] args) throws FileNotFoundException {
        //System.setIn(new FileInputStream("/Users/development/Devwork/Java/IdeaProjects/JavaLearning/src/com/" +
        //        "company/aftergapinterviewprep/input.txt"));

        // 'List' interface (so basically 'ArrayList') - Most frequently used methods
        List<Integer> arr = new ArrayList(Arrays.asList(5, 6, 7, 6)); // (1.a) Init using Arrays.asList()
        int reqSize = 15, reqValue = 0;
        List<Integer> arr2 = new ArrayList(Collections.nCopies(reqSize, reqValue)); // (1.b) Init using Collections.nCopies(size, value)
        arr.add(8); // (2) add() method
        arr.addAll(new ArrayList(Arrays.asList(1, 2, 3))); // (3) addAll() method
        arr.remove(5); // (4) remove() method has 2 variants (i) remove(int index) [less used] (ii) remove(Object ob) [preferred]
        arr.size(); // (5) size() method
        Collections.sort(arr); // (6) Collections.sort() method
        // arr.clear(); // (7) Removes all the elements from arr
        arr.equals(new ArrayList(Arrays.asList(5, 6, 7))); // (8) equals() method
        System.out.println(arr.indexOf(6)); // (9) Return the index of first occurrence or -1 if value is not present
        arr.get(1); // (10) get element at index 1 with get() method
        int index = 2; Integer value = 8;
        arr.set(index, value); // (11) set value at index using the set() method

        // 'Stack' class - Most frequently used methods
        Stack<Integer> st = new Stack<Integer>(); // (1) Initialising a Stack
        st.push(23); st.push(15); // (2) push() method to insert element on the top
        Integer poppedElement = st.pop(); // (3) pop() method to remove an element from stack, it also returns element's value
        Integer topElement = st.peek(); // (4) peek() method to access the top element of the stack
        int size = st.size(); // (5) size() method to get the size of the stack

        // 'Queue' interface (so basically 'ArrayDeque') - Most frequently used methods
        Queue<Integer> q1 = new ArrayDeque(); Queue<Integer> q2 = new ArrayDeque(); // (1) Init a 'Queue' class object
        q1.size(); // (2) size() method to get the size
        boolean verdictQueue = q1.contains(25); // (3) Use contains() method to check if an element is present or not
        q1.add(56); q1.add(23); q1.add(38); // (4) add() method to insert elements in the queue
        q1.remove(56); // (5) remove() method to remove elements in the queue
        int headOfQueue1 = q1.peek(); // (6) peek() method will show the head of the queue without removing it
        int headOfQueue2 = q1.poll(); // (7) poll() method will remove the head from the queue and return it's value
        // Here, add() and poll() method are more frequently used

        // 'PriorityQueue' implementation class of 'Queue' interface [For Min heap (default) & Max heap]
        Queue<Integer> pqMin = new PriorityQueue(); // (1) We get the Min heap by default
        Queue<Integer> pqMax = new PriorityQueue(new Comparator<Integer>() {
           public int compare(Integer i1, Integer i2) {
               return (-1) * i1.compareTo(i2);
           }
        }); // (2) For a Max heap we can pass in a Custom Comparator in the constructor as above
        // All the other frequently used methods have been covered in the above 'Queue' interface
        // (3) For a PriorityQueue, the remove(int value) method which takes the value of the element to be removed is
        // linear time operation i.e. it takes O(n) time, so in-case if we require to use this method, we should
        // try to create a work around for this as we will get TLE mostly if we use this method
    }
}

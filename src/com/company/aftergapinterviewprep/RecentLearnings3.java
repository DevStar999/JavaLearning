package com.company.aftergapinterviewprep;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class RecentLearnings3 {

    public static void main(String[] args) throws FileNotFoundException {
        //System.setIn(new FileInputStream("/Users/development/Devwork/Java/IdeaProjects/JavaLearning/src/com/" +
        //        "company/aftergapinterviewprep/input.txt"));

        // 'List' interface (so basically 'ArrayList') - Most frequently used methods
        List<Integer> arr = new ArrayList(Arrays.asList(5, 6, 7, 6)); // (1.a) Init using Arrays.asList()
        int reqSize = 15, reqValue = 0;
        List<Integer> arr2 = new ArrayList(Collections.nCopies(reqSize, reqValue)); // (1.b) Init using Collections.nCopies(size, value)
        arr.add(8); // (2) add() method
        arr.addAll(new ArrayList(Arrays.asList(1, 2, 3))); // (3) addAll() method
        arr.size(); // (4) size() method
        Collections.sort(arr); // (5) Collections.sort() method
        // arr.clear(); // (6) Removes all the elements from arr
        arr.equals(new ArrayList(Arrays.asList(5, 6, 7))); // (7) equals() method
        System.out.println(arr.indexOf(6)); // (8) Return the index of first occurrence or -1 if value is not present
        arr.get(1); // (9) get element at index 1 with get() method
        int index = 2; Integer value = 8;
        arr.set(index, value); // (10) set value at index using the set() method

        // 'Stack' class - Most frequently used methods
        Stack<Integer> st = new Stack<Integer>(); // (1) Initialising a Stack
        st.push(23); st.push(15); // (2) push() method to insert element on the top
        Integer poppedElement = st.pop(); // (3) pop() method to remove an element from stack, it also returns element's value
        Integer topElement = st.peek(); // (4) peek() method to access the top element of the stack
        boolean verdict = st.empty(); // (5) to check if the stack is empty or not, although this can be done by size() method as well
        int size = st.size(); // (6) size() method to get the size of the stack
        int indexValue = st.search(23); // (7) search() method to search if an element is present in the stack
    }
}

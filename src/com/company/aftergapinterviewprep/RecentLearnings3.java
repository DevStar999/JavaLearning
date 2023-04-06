package com.company.aftergapinterviewprep;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

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

        // 'Set' interface (so basically 'HashSet' or 'TreeSet') - Most frequently used methods
        Set<Integer> s1 = new HashSet(); Set<Integer> s2 = new TreeSet(); // (1.a) Init a 'Set' class object
        // (1.b) Init a TreeSet of descending order i.e. here the higher value elements come first
        Set<Integer> descendingOrderSet = new TreeSet<>(new Comparator<Integer>() {
            public int compare(Integer i1, Integer i2) {
                return (-1) * (i1.compareTo(i2));
            }
        });
        int sizeOfSet = s1.size(); // (2) size() method to get the size
        boolean verdictOfContains = s1.contains(4); // (3) Use contains() method to check if an element is present or not
        s1.add(87); s1.add(54); // (4) Use the add() method to add elements into the set
        s1.remove(Integer.valueOf(54)); // (5) Using remove() method to remove 54 by value (Boxing here to ensure we are
        // removing by the given object of the set)

        // 'Map' interface (so basically 'HashMap' & 'TreeMap') - Most frequently used methods
        Map<Integer, Integer> map1 = new HashMap(); Map<Integer, Integer> map2 = new TreeMap(); // (1.a) Init a 'Map' class object
        // (1.b) Init a TreeMap of descending order i.e. here the elements with higher value keys, come first
        Map<String, Integer> descendingOrderMap = new TreeMap(new Comparator<String>() {
            public int compare(String i1, String i2) {
                return (-1) * (i1.compareTo(i2));
            }
        }); // The Comparator is for the strictly for keys only and thus the type declared in the Comparator is 'String'
        map2.put(5, 10); // (2) For updating the value of an entry in a map, we have to use the put() method
        boolean verdictContainsKey = map2.containsKey(5); // (3) containsKey() will return true is key exists
        boolean verdictContainsValue = map2.containsValue(10); // (4) containsValue() will return true is at-least one key maps to the given value
        int sizeOfMap = map1.size(); // (5) size() method to get the size of the map
        Integer valueOfKey = map2.get(5); // (6) get() method to get the value for the given key
        map2.remove(5); // (7) remove() method to remove an entry from the map using the given key
    }
}

package com.company.aftergapinterviewprep;

import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

@SuppressWarnings("DuplicatedCode")
public class RecentLearnings5 {

    public static void main(String[] args) throws FileNotFoundException {
        /* Most commonly used iteration and traversal techniques are as follows */
        // For Arrays
        int[] arr = new int[10];
        for (int i=0; i<10; i++) {
            arr[i] = i;
        }

        // For Strings
        String str = "SampleString";
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
        }

        // For List i.e. ArrayList
        List<Integer> list = new ArrayList();
        list.add(1); list.add(2); list.add(3); list.add(4); list.add(5);
        for (int i=0; i<list.size(); i++) { // (1) Using index [1st preference]
            Integer temp = list.get(i);
        }

        Iterator<Integer> it = list.iterator();
        System.out.println("For List i.e. ArrayList - Using iterator");
        while (it.hasNext()) { // (2) Using iterator [2nd preference]
            System.out.print(it.next() + " ");
        } System.out.println();

        // For Stack
        Stack<Integer> st = new Stack();
        st.push(53); st.push(15); st.push(7); st.push(22);
        System.out.println("For Stack - Using Stack's pop() method");
        while (st.size() > 0) { // (1) This is the order that we want i.e. LIFO (Last-in-first-out) [1st preference]
            System.out.print(st.pop() + " ");
        } System.out.println();

        st.push(53); st.push(15); st.push(7); st.push(22);
        Iterator<Integer> itStack = st.iterator();
        System.out.println("For Stack - Using iterator");
        while (itStack.hasNext()) { // (2) Shows in the order in which they were inserted
            System.out.print(itStack.next() + " ");
        } System.out.println();


        // For Queue i.e. ArrayDeque & PriorityQueue
        Queue<Integer> q = new ArrayDeque();
        q.add(15); q.add(24); q.add(8); q.add(32); q.add(18);
        System.out.println("For Queue i.e. ArrayDeque & PriorityQueue - Using Queue's poll() method");
        while (q.size() > 0) { // (1) This is the order that we want i.e. FIFO (First-in-first-out) [1st preference]
            System.out.print(q.poll() + " ");
        } System.out.println();


        // For Set
        Set<Integer> set1 = new TreeSet();
        set1.add(45); set1.add(11); set1.add(23); set1.add(7);
        Iterator<Integer> itSet = set1.iterator();
        System.out.println("For Set i.e. TreeSet & HashSet - Using iterator");
        while (itSet.hasNext()) { // (1) For set using iterator seems like the best option [1st preference]
            System.out.print(itSet.next() + " ");
        } System.out.println();

        // For Map
        Map<String, Integer> map = new TreeMap();
        System.out.println("For Map - Using map.entrySet()");
        map.put("16", 16); map.put("35", 35); map.put("08", 8); map.put("42", 42); map.put("27", 27);
        // (1) This is the preferred way to traverse in a Map
        for (Map.Entry<String, Integer> element: map.entrySet()) {
            System.out.println(element.getKey() + " -> " + element.getValue());
        }
    }
}

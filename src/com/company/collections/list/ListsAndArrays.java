package com.company.collections.list;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListsAndArrays {
    public static void main(String[] args) {
        String words[] = {"one", "two", "three", "four"};
        List<String> list = new LinkedList<>(Arrays.asList(words));

        list.add("last_element");
        ((LinkedList<String>) list).addFirst("first_element");

        System.out.println("The list is printed as follows :");
        for (String str : list) {
            System.out.print(str + " ");
        }
        System.out.println();

        words = list.toArray(new String[list.size()]);
        System.out.println("The array is printed as follows :");
        for (String str : words) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}

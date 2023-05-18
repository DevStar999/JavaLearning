package com.company.recentlearnings.part1;

import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class RL04Basics {

    public static void main(String[] args) throws FileNotFoundException {
        //System.setIn(new FileInputStream("/Users/development/Devwork/Java/IdeaProjects/JavaLearning/src/com/" +
        //        "company/recentlearnings/input.txt"));

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
        map2.getOrDefault(5, 0); // (8) getOrDefault() method is used when we don't want to check if a
        // key exist or not and wish to get a specific default value
        TreeMap<Integer, Integer> map3 = new TreeMap<Integer, Integer>(); // If we directly create an object of the TreeMap then
        int firstKeyValue = map3.firstKey(); // (9.a) firstKey() gives the first key of the sorted order (Min value by default)
        int lastKeyValue = map3.lastKey(); // (9.b) lastKey() gives the last key (Max value by default)
    }
}

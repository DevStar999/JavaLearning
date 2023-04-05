package com.company.aftergapinterviewprep;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

public class Rough19 {

    public static void main(String[] args) throws FileNotFoundException {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(5, map.get(2)+1);
        System.out.println(map.toString());
    }
}

package com.bree.CodingPractice;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        map.put("Bree" , 2004);
        map.put("Steve" , 2003);
        map.put("Bobby" , 2002);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " " + "was born in the year" + " " +value + "...");
        }

    }
}

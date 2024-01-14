package com.bree.CodingPractice;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        //creating a hashmap and an object called map
        HashMap<String,String> map = new HashMap<>();

        //adding values to the hashmap using map() method
        map.put("Bree Mukami" , "C026-01-0921/2022");
        map.put("Steve Muish" , "C026-01-0931/2022");
        map.put("Bobby Lashly" , "C026-01-0922/2022");

        //printing the values in the hashmap
        System.out.println(map);

        //using get() method to get values from the hashmap
        String result = map.get("Bree Mukami");
        System.out.println(result);

        //removing an element using remove() method
        String update = map.remove("Bobby Lashly");
        System.out.println(map);

        //checking if an element is present in the hashmap
        boolean present = map.containsKey("Bobby Lashly");
        System.out.println(present);
    }
}
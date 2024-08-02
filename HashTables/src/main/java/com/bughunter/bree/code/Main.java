package com.bughunter.bree.code;

import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {

        Hashtable<Integer,String> table = new Hashtable<>(10);
        table.put(100,"Bree");
        table.put(101,"Chebby");
        table.put(102,"Steve");
        table.put(122,"Muish");
        table.put(123,"Kate");
        table.put(104,"Kiki");
        table.put(111,"Koko");

        table.remove(104);
        for(Integer key : table.keySet()){
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t " + table.get(key));

        }

    }
}

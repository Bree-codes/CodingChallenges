package com.bree.CodingChallenges;

public class Main {
    public static void main(String[] args) {

        String str ="Hello World!!";
        System.out.println(reverseManually(str));
    }

    private static String reverseManually(String str) {
        return new StringBuilder(str)
                .reverse()
                .toString();
        
    }

}
package com.bree.CodingChallenges;

public class Main {
    public static void main(String[] args) {
        String str = "Hello World!!";
        System.out.println(reverseWithStringBuilder(str));

    }

    private static String reverseWithStringBuilder(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = str.length() - 1 ; i >= 0 ; i--){
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }
}
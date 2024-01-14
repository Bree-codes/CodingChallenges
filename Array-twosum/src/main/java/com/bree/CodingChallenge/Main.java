package com.bree.CodingChallenge;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public int[] twoSum(int[] nums,int target) {
        Map<Integer,Integer> num_map = new HashMap<>();
        for(int i = 0 ; i <nums.length; i++){
            int complement = target - nums[i];
            if(num_map.containsKey(complement)) {
                return new int[] {num_map.get(complement) , i};
            }
            num_map.put(nums[i] , i);
        }

        throw new IllegalArgumentException("no match found");
    }
    public static void main(String[] args) {
        Main main = new Main();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = main.twoSum(nums, target);
        System.out.println("The indexes for the values that add up to the target are : " + result[0] + ", " + result[1]);
    }
}



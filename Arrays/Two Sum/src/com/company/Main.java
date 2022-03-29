package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Main {

    public static void main(String[] args) {
        int []nums = {2, 7, 11, 15};
        int []arr = twoSum(nums, 9);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();


        for (int i=0; i<nums.length; i++){
            int val = (target - nums[i]);
            if (map.containsKey(val) && map.get(val) != i){
                int index = map.get(val);
                return new int[] {i, index};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}

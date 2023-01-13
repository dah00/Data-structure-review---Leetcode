package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println("obeda");
    }

    private static String intToRoman(int num){
        Map<Integer, String> map = new HashMap<>();

        // Fill the HashMap with <key, value> = <digits, Roman numbers>
        // include 4, 9, 40, 90, 400, and 900
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");

        // if the given num matches one of the numbers in the map, just return its mapping value
        if(map.containsKey(num))
            return map.get(num);

        // if the num is not in map then keep subtracting num with k
        // such as k is m's closest the number && num>k until num reaches 0
        StringBuilder roman = new StringBuilder();
        int[] nums = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

        while(num != 0){
            int i=1;
            while(i<nums.length && num>nums[i]){
                i++;
            }
            int k = nums[i-1];

            roman.append(map.get(k));
            num -= k;
        }

        return roman.toString();
    }
}

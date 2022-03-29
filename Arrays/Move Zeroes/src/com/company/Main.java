package com.company;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1,0,3,0,0,12};

        if(nums == null || nums.length == 0)
            return;

        int index = 0;
        for(int num: nums)
            if(nums[index] != 0)
                nums[index++] = num;

        while(index<nums.length)
            nums[index++] = 0;

        // Brute force
        /*
        for(int i=0 ; i<nums.length-1;i++){
            if(nums[i] == 0){
                int j=i+1;
                while(j<nums.length && nums[j]==0)
                    j++;
                if(j<nums.length){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

         */
    }
}

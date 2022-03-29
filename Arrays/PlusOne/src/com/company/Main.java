package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int digits[] = {9};
        int len = digits.length;
        if(digits[len-1] != 9)
            digits[len-1]++;
        else{
            int i=len-1;
            while(i>=0 && digits[i] == 9){
                digits[i] = 0;
                i--;
            }
            if(i>=0){
                digits[i]++;
            }
            else{
                int[] arr = new int[len+1];
                arr[0] = 1;
                for(int j=1; j<arr.length; j++)
                    arr[j] = 0;
                System.out.println(Arrays.asList(arr));
            }
        }
        System.out.println(Arrays.asList(digits));
    }
}

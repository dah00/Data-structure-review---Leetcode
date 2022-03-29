package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7}, {15,14,12,16}};
        rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    public static void rotate(int[][] matrix) {
        int n = matrix.length-1;
        int start = 0;
        int end = n;
        for(int i=start; i<= (n+1)/2; i++){
            int dec = end;
            for(int j=start; j<end; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[dec][i];
                matrix[dec][i] = matrix[end][dec];
                matrix[end][dec] = matrix[j][end];
                matrix[j][end] = temp;
                dec--;
            }
            start++;
            end--;
        }


    }
}

package com.company;

public class Main {

    public static void main(String[] args) {

    }
    public static void reverseString(char[] s) {
        int end = s.length-1;
        for(int start=0; start<s.length/2; start++){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            end--;
        }
    }
}

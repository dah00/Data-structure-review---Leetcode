package com.company;

import java.util.Arrays;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String str = "Tact Coapaap";
        System.out.println(isPalindromePermutation(str));

        System.out.println(Character.getNumericValue('Z'));


    }
    // Solution 1
    private static boolean isPalindromePermutation(String str){
        str = str.replaceAll("\\s", "");    // Remove white space
        str = str.toLowerCase();
        int[] charFreq = new int[128];
        for (char chr: str.toCharArray()){
            charFreq[chr]++;
        }

        int oddFreq=0;
        for(int i=0; i<charFreq.length; i++){
            if(charFreq[i] % 2 != 0){
                oddFreq++;
            }
        }
        return oddFreq <= 1;
    }

    // Solution 2
    /*
    Map each character to a number. a->0, b->1, c->2, etc
    It is case insensitive. Non-letter characters map to -1
     */
    private static int getCharNumber(Character c){
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if(a<=val && val<=z){
            return val-a;
        }
        return -1;
    }

    /*
        Count how many times each character appears
     */
    int[] buildCharFrequencyTable(String phrase){
        // the +1 is for the index -1
        int[] table = new int[Character.getNumericValue('z')-Character.getNumericValue('a')+1];
        for(char c: phrase.toCharArray()){
            int x = getCharNumber(c);
            if(x != -1){
                table[x]++;
            }
        }
        return table;
    }

    private static boolean isPermutationOfPalindrome(String phrase){
        int countOdd = 0;
        int[] table = new int[Character.getNumericValue('z')-Character.getNumericValue('a')+1];
        for(char c: phrase.toCharArray()){
            int x = getCharNumber(c);
            if(x != -1){
                table[x]++;
                if(table[x]%2 == 1){
                    countOdd++;
                }
                else{
                    countOdd--;
                }
            }
        }
        return countOdd <=1;
    }
}

package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] words = {"bella", "label", "roller"};
        List list = commonChars(words);

    }

    private static List<String> commonChars(String[] words){
        List<String> list = new ArrayList<>();
        /*
            [
            b:0
            e:1
            l:1
            a:1
            ]
            bella   -   label, roller
               ^        ^       ^
         */
        if(words.length == 1){
            for(char c: words[0].toCharArray()){
                list.add(Character.toString(c));
            }
            return list;
        }

        int[] table = new int[26];
        Arrays.fill(table, Integer.MAX_VALUE);
        for(String word: words){
            int[] count = new int[26];
            for(char c: word.toCharArray()){
                count[c-'a']++;
            }
            System.out.println("count -> " + Arrays.toString(count));
            for(int i=0; i<26; i++){
                table[i] = Math.min(count[i], table[i]);
            }
        }

        System.out.println("table -> " + Arrays.toString(table));

        for(char c='a'; c<='z'; c++){
            while(table[c-'a'] > 0){
                list.add(""+c);
                table[c-'a']--;
            }
        }
        return list;
    }

    /*
        Map out character with an integer: a->0, b->1, ..., z->25
     */
    private static int[] MapNumberOfCharacter(String str){
        int[] table = new int[Character.getNumericValue('a') - Character.getNumericValue('z')+1];
        for(char c: str.toCharArray()){
            table[c]++;
        }
        return table;
    }
}

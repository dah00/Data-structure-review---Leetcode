import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String str1 = "awesome";
        String str2 = "sowmeawe";

        if(str1.length() != str2.length())
            System.out.println("Not a permutation");
        if(sort(str1).equals(sort(str2)))
            System.out.println("It is a permutation");

    }

    private static String sort(String str){
        char[] chr = str.toCharArray();
        Arrays.sort(chr);
        return new String(chr);
    }

    /*
        Given two strings, write a method to check if one is the permutation of the other
     */

    private static boolean isPermutation(String str1, String str2){
        // O(n) Using HashMap
        /*if (str1.length() != str2.length())
            return false;

        Map<Character, Integer> map = new HashMap<>();
        for (int i=0; i<str1.length(); i++){
            Character chr = str1.charAt(i);
            map.put(chr, map.getOrDefault(chr, 0) + 1);
        }

        for (int i=0; i<str2.length(); i++){
            Character chr = str2.charAt(i);
            if (map.containsKey(chr) && map.get(chr) > 0){
                map.put(chr, map.get(chr)-1);
            }
            else
                return false;
        }

        for (Map.Entry<Character, Integer> entry: map.entrySet()){
            if (entry.getValue() != 0)
                return false;
        }
        return true;*/

        // O(n) by sorting the two strings before comparing them.
        /*if (str1.length() != str2.length()){
            return false;
        }

        *//*str1 = sort(str1);
        str2 = sort(str2);*//*
        return sort(str1).equals(sort(str2));*/

        // O(n) character counts
        if (str1.length() != str2.length())
            return false;
        char[] chr = new char[128];
        for (int i=0; i<str1.length(); i++){
            int index = str1.charAt(i);
            chr[index]++;
        }

        for (int i=0; i<str2.length(); i++){
            int index = str2.charAt(i);
            if (chr[index] < 1)
                return false;
            chr[index]--;
        }

        return true;

    }

   /* private static String sort(String str){
        char[] content = str.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }*/
}

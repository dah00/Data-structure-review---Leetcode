import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        String str1 = "bate";
        String str2 = "pale";
        System.out.println(oneAway(str1, str2));
        System.out.println(str1.contains("p"));

    }

    /*
        a -> 0
        b -> 1
        c -> 2
        ...
        z -> 25
        table[p] = 1
        .....[b] = 1
        .....[a] = 0
        .....[l] = 0
        .....[e] = 0
        .....[s] = 0

        ----

        ex: palletts - pallett  -> true
        {p: 0, a:0, l:0, e:0, t:0, s:1}

        ex: bale
            balle
                ^
            countDiff = 2

        ex: balle
            bale

            countDiff =

       */
    private static boolean oneAway(String str1, String str2){
        int lengthDifference = Math.abs(str1.length() - str2.length());
        if(lengthDifference > 1)
            return false;
        // length difference = 0 -> Replacement
        if(lengthDifference == 0){
            int countDiff = 0;
            for(int i=0; i<str1.length(); i++){
                if(str1.charAt(i) != str2.charAt(i))
                    countDiff++;
                if(countDiff > 1)
                    return false;
            }
            return true;
        }

        // length difference = 1 -> Insertion or Removal
        /*

         */
        if(str2.length()>str1.length())
            return oneEditInsert(str1, str2);
        else
            return oneEditInsert(str2, str1);
    }

    //    Check if you can insert a character into s1 to make s2.
    //    ex: s1 = pale, s2 = palle
    private static boolean oneEditInsert(String s1, String s2){
        int index1 = 0, index2 = 0;
        while(index2 < s2.length() && index1 <s1.length()){
            if(s1.charAt(index1) != s2.charAt(index2)){
                if(index1 != index2)
                    return false;
                index2++;
            }
            else {
                index1++;
                index2++;
            }
        }
        return true;
    }
}


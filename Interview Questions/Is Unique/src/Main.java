import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String str = "obeda";
        int index = str.charAt(2);
        System.out.println(index);
    }

    private static boolean isUnique(String str){
        // USING DATA STRUCTURE
        /*Set<Character> set = new HashSet<>();
        for(int i=0; i<str.length(); i++){
            if(!set.contains(str.charAt(i)))
                set.add(str.charAt(i));
            else
                return false;
        }
        return true;*/

        // WITH NO DATA STRUCTURE USED O(n^2)
       /* for(int i=0; i<str.length()-1; i++){
            char chr_i = str.charAt(i);
            for(int j=i+1; j<str.length(); j++){
                char chr_j = str.charAt(j);
                if (chr_i == chr_j)
                    return false;
            }
        }
        return true;*/

        // Most optimal soluton
        if(str.length() > 128)
            return false;
        boolean[] bool = new boolean[128];
        for (int i=0; i<str.length(); i++){
            int index = str.charAt(i);
            if (bool[index])
                return false;
            bool[index] = true;
        }
        return true;
    }
}

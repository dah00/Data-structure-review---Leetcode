import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String str1 = "rat";
        String str2 = "car";
        System.out.println('z' - 'a');
        //System.out.println(isAnagram(str1, str2));
    }

    // Best solution
    /*public boolean isAnagram(String s, String t) {
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
        for (int i : alphabet) if (i != 0) return false;
        return true;
    }*/

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;

        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            Character character = s.charAt(i);
            map.put(character, map.getOrDefault(character, 0)+1);
        }

        for (int i=0; i<t.length(); i++){
            Character character = t.charAt(i);
            if (map.containsKey(character) && map.get(character)>0)
                map.put(character, map.get(character)-1);
            else
                return false;
        }

        return true;
    }
}

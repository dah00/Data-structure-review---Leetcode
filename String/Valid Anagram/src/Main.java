import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String str1 = "rat";
        String str2 = "car";
        System.out.println(isAnagram(str1, str2));
    }

    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            Character character = s.charAt(i);
            map1.put(character, map1.getOrDefault(character, 0)+1);
        }

        for(int i=0; i<t.length(); i++){
            Character character = s.charAt(i);
            map2.put(character, map2.getOrDefault(character, 0)+1);
        }

        return map1.equals(map2);
    }
}

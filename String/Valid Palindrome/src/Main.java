import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String s = "ObeDGSa fasd78,42&*& LFiuba";
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        System.out.println(s);
    }

    public static boolean isPalindrome(String s) {
        /*
            1. remove all non-alphanumeric characters
            2. Convert all uppercase into lowercase
            3. Remove all white space
            4. Reverse s and put in another string
            5. Compare the two strings
         */
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase(Locale.ROOT);

        String reversedS = new StringBuilder(s).reverse().toString();

        return s.equals(reversedS);
    }
}

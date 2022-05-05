public class Main {
    public static void main(String[] args) {

    }

    public static int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length())
            return -1;
        if (needle.isEmpty())
            return 0;
        // haystack = "heliole", needle = "ll"
        // 1. Find the occurrence of the first character of needle in haystack
        //      int index -> Look for the first 'l' in haystack until haystack.length - needle.length
        // 2. Compare the needle with haystack.substring(index, index + needle.length)
        //      a. if equal then return index
        //      b. if not, look for the next occurrence until the haystack.length - needle.length

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int index = -1;
            if (haystack.charAt(i) == needle.charAt(0)) {
                index = i;
            }
            if ( index != -1 && needle.equals(haystack.substring(index, index + needle.length())))
                return index;
        }

        return -1;

    }
}

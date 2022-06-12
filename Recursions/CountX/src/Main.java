public class Main {
    public static void main(String[] args) {
    }

    public static int countX(String str) {
        /*
            Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.

            countX("xxhixx") → 4
            countX("xhixhix") → 3
            countX("hi") → 0
         */

        /*
            countX("xxhixx")?
                ->
         */
        if(str.isEmpty())
            return 0;
        if (str.charAt(0) == 'x')
            return 1 + countX(str.substring(1));
        else
            return countX(str.substring(1));
    }

}

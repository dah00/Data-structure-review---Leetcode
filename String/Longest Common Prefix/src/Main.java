public class Main {
    public static void main(String[] args) {
        String str = "";
        str = str.concat("Welcome");
        System.out.println(str);
    }


    private static String longestCommonPrefix(String[] strs){
        if (strs.length == 0)
            return "";
        String commonStr = "";
        for (int i=0; i<strs[0].length(); i++){
            char tempStr = strs[0].charAt(i);
            for (String str : strs){
                if (i>=str.length() || !(str.charAt(i) == tempStr))
                    return commonStr;
            }
            commonStr = commonStr.concat(String.valueOf(tempStr));
        }

        return commonStr;
    }
}

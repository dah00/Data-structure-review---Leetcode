public class Main {
    public static void main(String[] args) {
        String str = " i   ";
        //System.out.println(str.length());
        System.out.println(URLify(str, 2));
    }
    /*
        Write a method to replace all spaces in a string with '%20' You may assume that hte string has sufficient space at the end to hold the additional
        characters, and that you are given the "true" length of the string. (Noe: If implementing in Java, please use a character array so that you can
        perform this operation in place. )
     */

    private static String URLify(String str, int size){
        char[] str_array = str.toCharArray();
        int i = size-1, j = str.length()-1;
        while(i>=0){
            char chr = str_array[i];
            if (chr != ' '){
                str_array[j--] = str_array[i--];
            }
            else{
                str_array[j--] = '0';
                str_array[j--] = '2';
                str_array[j--] = '%';
                i--;
            }
        }
        return new String(str_array);
    }
}

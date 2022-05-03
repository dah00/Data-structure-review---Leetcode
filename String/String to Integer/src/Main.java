public class Main {
    public static void main(String[] args) {
        String str = "+-12";
        int result = myAtoi(str);

        System.out.println();
    }

    public static int myAtoi(String s){
        boolean isPositive = true;
        int result = 0;
        int i = 0;
        s = s.trim();
        if (i<s.length() && s.charAt(i) == '-'){
            isPositive = false;
            s = s.substring(1);
        }
        else if (i<s.length() && s.charAt(i) == '+')
            s = s.substring(1);

        while(i<s.length() && Character.isDigit(s.charAt(i))){
            int remainder = Integer.parseInt(String.valueOf(s.charAt(i)));
            if (result < Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE/10 && remainder <= Integer.MAX_VALUE%10)) {
                result *= 10;
                result += remainder;
            }
            else {
                if (isPositive)
                    return Integer.MAX_VALUE;
                return Integer.MIN_VALUE;
            }
            i++;
        }

        if (i==0)
            return 0;

        if (!isPositive)
            result *= -1;

        return result;
    }
}

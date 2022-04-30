public class Main {
    public static void main(String[] args) {
        String str = "+-12";
        int result = myAtoi(str);
        System.out.println(result);
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
            if (s.charAt(i) == '0')
            i++;
        }

        if (i==0)
            return 0;

        // Checking if s is out of 32-bit signed integer range
        s = s.substring(0,i);
        if (s.length() > 10){
            if (isPositive)
                return Integer.MAX_VALUE;
            return Integer.MIN_VALUE;
        }

        result = Integer.parseInt(s);
        if (!isPositive)
            result *= -1;

        return result;
    }
}

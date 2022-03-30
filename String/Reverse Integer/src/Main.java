public class Main {
    public static void main(String[] args) {
        long test = 964632435;
        System.out.println(test > Integer.MAX_VALUE);
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {
        int result = 0;
        while (x != 0){
            int rest = x%10;
            int newresult = (result*10) + rest;
            // TODO: try to fully understand this condition
            if((newresult-rest)/10 != result)
                return 0;
            result = newresult;
            x /= 10;
        }
        return result;
    }
}

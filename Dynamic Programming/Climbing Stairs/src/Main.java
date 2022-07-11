import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(4);
        arr.add(1);
        arr.add(1);
        arr.add(2);
        arr.add(2);
        System.out.println(arr.size());
        System.out.println(arr);
    }

    public static int climbStairs(int n) {
        /*
            n = 2
                1. 1 + 1
                2. 2

            n = 3
                1. 1 + 1 + 1
                2. 1 + 2
                3. 2 + 1

            n = 4
                1. 1+1+1+1
                2. 1+1+1    x   if sum<n then replace one digit 1 to 2
                3. 2+1+1
                4. 1+2+1
                5. 1+1+2
                6. 2+2

            n=3
                1+1+1       3 digits of 1s so we need to start testing from 2 digits now.
                1+1     x   not enough
                1+2
                2+1
                2+2

         */
        int count=0;
        ArrayList<Integer> arr = new ArrayList<>(n);
        for(int i=1; i<=n; i++) {
            arr.add(i);
        }
        while(arr.size() >= (n/2)){


        }
        return 0;
    }
}

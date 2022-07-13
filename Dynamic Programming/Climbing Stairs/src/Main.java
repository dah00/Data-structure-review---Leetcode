import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(4);
        arr.add(1);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        System.out.println(arr.size());
        System.out.println(arr.get(3));
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

                Rules:
                when size is reduced, there must be at least one 2
                if(sum<n)
                    add the number of two until (sum >= n) but keep the same size of array
                    when size decrement, the number of 2s in the array increment

         */

        // Recursive method
        /*
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 2;
        return climbStairs(n-1) + climbStairs(n-2);*/

        // Dynamic programming
        /*
            if(n==1)
                return 1;
            int[] memo = new int[n];
            memo[0] = 1;
            memo[1] = 2;
            for(int i=2; i<n; i++)
                memo[i] = memo[i-2] + memo[i-1];
            return memo[n-1];
         */

        // Memorization using HashMap
        Map<Integer, Integer> memo = new HashMap<>();
        memo.put(1,1);
        memo.put(2,2);
        return helper(n, memo);
    }

    private static int helper(int n, Map<Integer, Integer> memo){
        if(memo.containsKey(n))
            return memo.get(n);
        memo.put(n, helper(n-1, memo) + helper(n-2, memo));
        return memo.get(n);
    }


}

import java.util.ArrayList;

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
        int count=0;
        ArrayList<Integer> arr = new ArrayList<>(n);
        for(int i=0; i<n; i++) {
            arr.add(i);
        }
        while(arr.size() >= (n/2)){
            int ones = 0, twos = 0, sum = 0;
            for(int i=0; i<arr.size(); i++){
                if (arr.get(i) == 1)
                    ones++;
                else if (arr.get(i) == 2)
                    twos++;
                sum += arr.get(i);
            }
            if (sum == n){
                count = helper(arr.size(), ones, twos);
            }
            else if(sum > n){
                arr.remove(arr.size()-1);
                arr.set(arr.size()-2, 2);   // double check
            }
            else if(sum < n){
                while
            }

        }
        return 0;
    }

    private static int helper(int size, int ones, int twos){
        return 0;
    }

}

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[2];

    }
    public static int maxProfit(int[] prices) {
        /* prices = [7, 1, 5, 3, 6, 4]
            output = 5 => buy on day 2 (price = 1) and sell on day 5 (price = 6)

            ** Intuition
            choose prices[0] = 7
                check profit for each day after buying
                if
        */

        // Brute force
        int profit = 0;
        for(int i=0; i<prices.length-1; i++){
            int buy = prices[i];
            for(int j=i+1; j<prices.length; j++){
                int sell = prices[j];
                if((sell - buy) > profit)
                    profit = sell - buy;
            }
        }
        return profit;


    }
}

public class Main {
    public static void main(String[] args) {
        for(int i=0; i<6; i=i+2){

        }
    }
    private static int rob(int[] nums){
        int sumEven = 0, sumOdd = 0;
        for(int i=0; i<nums.length; i=i+2){
            sumEven += nums[i];
        }

        for(int i=1; i<nums.length; i=i+2){
            sumOdd += nums[i];
        }

        return Integer.max(sumEven, sumOdd);
    }
}

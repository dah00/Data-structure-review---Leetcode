public class Main {
    public static void main(String[] args) {

    }

    private static int maxSubArray(int[] nums){
        int max = nums[0], maxUntilNow = nums[0];
        for (int i=1; i<nums.length; i++){
            maxUntilNow = Integer.max(maxUntilNow + nums[i], nums[i]);
            max = Integer.max(max, maxUntilNow);
        }
        return max;
    }
}

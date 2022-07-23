public class Main {
    public static void main(String[] args) {
        for(int i=0; i<6; i=i+2){

        }
    }
    private static int rob(int[] nums){
        return helper(nums, nums.length - 1);
    }
    private static int helper(int[] nums, int i) {
        if (i < 0) {
            return 0;
        }
        return Math.max(helper(nums, i - 2) + nums[i], helper(nums, i - 1));
    }
}

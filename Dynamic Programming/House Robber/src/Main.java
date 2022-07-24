public class Main {
    public static void main(String[] args) {
        for(int i=0; i<6; i=i+2){

        }
    }
    private static int rob(int[] nums){
        int[] memo = new int[nums.length+1];
        memo[0] = 0;
        memo[1] = nums[0];
        for(int i=1; i<nums.length; i++){
            memo[i+1] =  Math.max(memo[i], memo[i-1] + nums[i]);
        }
        return memo[nums.length];
    }
}

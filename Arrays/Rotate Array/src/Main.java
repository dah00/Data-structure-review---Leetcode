import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int k = 3;
        int[] nums = {1,2,3,4,5,6,7};

        reverse(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
        reverse(nums, 0, k-1);
        System.out.println(Arrays.toString(nums));
        reverse(nums, k, nums.length-1);

        System.out.println(Arrays.toString(nums));
    }

    static void reverse(int[] nums, int start, int end){
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}

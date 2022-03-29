import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int count = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        for (int i=0; i<nums1.length; i++){
            int j=0;
            boolean test = false;
            while(nums1[i]<=nums2[j] && j<nums2.length && !test){
                if (nums1[i] == nums2[j]){
                    count++;
                    test = true;
                    nums2[j] =
                }
            }
        }
    }
}

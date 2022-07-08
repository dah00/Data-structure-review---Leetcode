import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {-1, 0, 0, 3, 3, 3, 0 , 0, 0};
        int[] nums2 = {1, 2, 2};

        merge(nums1, 6, nums2, 3);
    }

    private static void merge(int[] nums1, int m, int[] nums2, int n){
        /*
            nums1 = [1,2,2,3,0,0], m = 3,
                             ^
            nums2 = [2,5,6], n = 3
                       ^
            2 indices: i for nums, and j for nums2

         */
        /*
        int[] result = new int[m+n];
        int i=0, j=0, index=0;
        while(index<n+m && j<n && i<m){
            if(nums1[i] < nums2[j]){
                result[index++] = nums1[i++];
            }else{
                result[index++] = nums2[j++];
            }
        }


        while(i<m && index<n+m){
            result[index++] = nums1[i++];
        }

        while(j<n && index<n+m){
            result[index++] = nums2[j++];
        }

        for(int z=0; z<nums1.length; z++){
            nums1[z] = result[z];
        }
        */

        // Shorter solution: Knowing that the arrays are sorted so we can traverse the array backward
        int index1=m-1, index2=n-1, index=m+n-1;
        while(index>=0 && index1>=0 && index2>=0){
            nums1[index--] = (nums1[index1] > nums2[index2]) ? nums1[index1--] : nums2[index2--];
        }

        while(index2>=0){
            nums1[index--] = nums2[index2--];
        }
    }
}

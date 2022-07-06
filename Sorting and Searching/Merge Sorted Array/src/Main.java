public class Main {
    public static void main(String[] args) {

    }

    private static void merge(int[] nums1, int m, int[] nums2, int n){
        /*
            nums1 = [1,2,2,3,0,0], m = 3,
                             ^
            nums2 = [2,5,6], n = 3
                       ^
            2 indices: i for nums, and j for nums2

         */
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

    }
}

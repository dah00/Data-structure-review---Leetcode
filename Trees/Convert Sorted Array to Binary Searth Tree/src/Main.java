public class Main {
    public static void main(String[] args) {

    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        // Divide and conquer.
        // Taking advantage of the fact that the array is sorted in ascending way
        // Divide: Get the mid of the array and set the mid to be the root
        //          Keep dividing the left of the array and set the mid of the left side to be the root's left child
        //          and keep on going. Same for right side of the array

        if(nums.length == 1)
            return new TreeNode(nums[0]);
        // Consider the case where the array contains only 2 elements
        int mid = nums.length/2;
        int start = 0, end = mid-1;
        TreeNode root = new TreeNode(nums[mid]);
        TreeNode current = root;
        // Traverse the left mid-side of the array
        while (start < end){
            mid = (start+end)/2;
            if(start==end)

                placeNode(current, new TreeNode(nums[mid]));
            else{

            }

        }
    }

    private void placeNode(TreeNode current, TreeNode newNode){
        if(current.val > newNode.val){
            if (current.left == null)
                current.left = newNode;
            else {
                placeNode(current.left, newNode);
            }
        }else {
            if(current.right == null)
                current.right = newNode;
            else {
                placeNode(current.right, newNode);
            }
        }

    }
}
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
        TreeNode root = helper(nums, 0, nums.length-1);
        return root;

    }


    private TreeNode helper(int[] nums, int start, int end){
        if (start > end)
            return null;
        int mid = (start+end)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums, start, mid-1);
        node.right = helper(nums, mid+1, end);
        return node;
    }
}
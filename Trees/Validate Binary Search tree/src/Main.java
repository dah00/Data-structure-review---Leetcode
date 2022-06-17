public class Main {
    public static void main(String[] args) {
        Integer a = 2;

    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    private static Integer prev;

    // 2nd solution: Recursive Inorder Traversal
    public static boolean isValidBST(TreeNode root){
        prev = null;
        return inorder(root);
    }

    private static boolean inorder(TreeNode root){
        if(root == null)
            return true;

        if(!inorder(root.left))
            return false;
        if (prev != null && root.val <= prev)
            return false;

        prev = root.val;
        return inorder(root.right);
    }
    
    // 3rd solution: Iterative traversal valid range
    /*
        class Solution {

    private Deque<TreeNode> stack = new LinkedList();
    private Deque<Integer> upperLimits = new LinkedList();
    private Deque<Integer> lowerLimits = new LinkedList();

    public void update(TreeNode root, Integer low, Integer high) {
        stack.add(root);
        lowerLimits.add(low);
        upperLimits.add(high);
    }

    public boolean isValidBST(TreeNode root) {
        Integer low = null, high = null, val;
        update(root, low, high);

        while (!stack.isEmpty()) {
            root = stack.poll();
            low = lowerLimits.poll();
            high = upperLimits.poll();

            if (root == null) continue;
            val = root.val;
            if (low != null && val <= low) {
                return false;
            }
            if (high != null && val >= high) {
                return false;
            }
            update(root.right, val, high);
            update(root.left, low, val);
        }
        return true;
    }
}
    */


    // 1st solution: Recursive Traversal with Valid Range
    /*public static boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }

    public static boolean helper(TreeNode root, Integer low, Integer high){
        if (root == null)
            return true;
        if((low != null && root.val <= low) || (high != null && root.val >= high))
            return false;
        return helper(root.left, low, root.val) && helper(root.right, root.val, high);
    }*/
}

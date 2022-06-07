public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        TreeNode.isValidBST(root);
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

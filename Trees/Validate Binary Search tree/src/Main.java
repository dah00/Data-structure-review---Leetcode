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

    public static boolean isValidBST(TreeNode root) {
        if(root.left == null && root.right == null)
            return true;
        boolean result = true;
        if (root.left != null){
            if (root.left.val < root.val)
                result = result && isValidBST(root.left);
            else
                return false;
        }

        if (root.right != null){
            if (root.right.val > root.val)
                result = result && isValidBST(root.right);
            else
                return false;
        }
        return result;
    }
}

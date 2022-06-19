import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main{
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

    public boolean isSymmetric(TreeNode root) {
        //Iterative solution
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root.left);
        stack.add(root.right);
        while (!stack.empty()){
            TreeNode node1 = stack.pop(), node2 = stack.pop();
            if (node1==null && node2==null)
                continue;
            if (node1==null || node2==null || node1.val != node2.val)
                return false;
            stack.add(node1.left);
            stack.add(node2.right);
            stack.add(node1.right);
            stack.add(node2.left);
        }
        return true;

        //return help(root.left, root.right);
    }

    // Recursive solution
    /*
        private boolean help(TreeNode left, TreeNode right){
        // base case
        if (left == null && right == null)
            return true;
        if(left == null || right == null || left.val != right.val)
            return false;
        return help(left.left, right.right) && help(left.right, right.left);
    }
     */
}

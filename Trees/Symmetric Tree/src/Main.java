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
        if(root.left == null && root.right == null)
            return true;

        Queue<TreeNode> queueTemp = new LinkedList<>();
        Queue<TreeNode> queueStore = new LinkedList<>();

        // Traversing the left side of the tree
        if(root.left != null){
            queueTemp.add(root.left);
            queueStore.add(root.left);
        }
        while (!queueTemp.isEmpty()){
            TreeNode node = queueTemp.poll();
            if(node != null){
                queueTemp.add(node.left);
                queueTemp.add(node.right);
                queueStore.add(node.left);
                queueStore.add(node.right);
            }
        }

        // Traversing the right side of the Tree
        if (root.right != null){
            queueTemp.add(root.right);
            if (root.right.val != queueStore.poll().val)
                return false;
        }
        while (!queueTemp.isEmpty()){
            TreeNode node = queueTemp.poll();
            if(node != null){
                queueTemp.add(node.right);
                queueTemp.add(node.left);
                if(node.right.val != queueStore.poll().val)
                    return false;
                if (node.left.val != queueStore.poll().val)
                    return false;
            }
        }
        return true;

    }
}

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> list = new LinkedList<>();
        list.add(new LinkedList<>(List.of(3)));
        System.out.println(list);
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

    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null)
            return new LinkedList<>();
        List<List<Integer>> list = new LinkedList<>();
        list.add(new LinkedList<>(List.of(root.val)));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int count = queue.size();
            List<Integer> tempList = new LinkedList<>();
            for (int i=0; i<count; i++){
                TreeNode node = queue.poll();
                if (node.left != null){
                    queue.add(node.left);
                    tempList.add(node.left.val);
                }
                if (node.right != null){
                    queue.add(node.right);
                    tempList.add(node.right.val);
                }
            }
            if(!tempList.isEmpty())
                list.add(tempList);
        }

        return list;
    }
}
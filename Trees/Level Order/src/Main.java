import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

    }
}

class Node{
    int data;
    Node left;
    Node right;

    public static void levelOrder(Node root) {
    /*
                    1
                  /   \
                 2     3
                / \   / \
               4   5 6   7

         Queue_display: 3
         Queue_storage:
     */
        Queue<Node> queue_display = new LinkedList<>();
        Queue<Node> queue_storage = new LinkedList<>();

        queue_display.add(root);
        while (!queue_display.isEmpty()){
            for (int i=0; i<queue_display.size(); i++){
                Node node = queue_display.poll();
                queue_storage.add(node);
                System.out.print(node.data + " ");
            }
            while (!queue_storage.isEmpty()){
                Node node = queue_storage.poll();
                if(node.left != null)
                    queue_display.add(node.left);
                if(node.right != null)
                    queue_display.add(node.right);
            }
        }
    }
}

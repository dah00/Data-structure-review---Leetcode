import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

    }
}

class Node{
    int data;
    Node left;
    Node right;

    public static void topView(Node root) {
        left_view(root.left);
        System.out.print(root.data + " ");
        right_view(root.right);
    }

    private static void left_view(Node root) {
        if (root == null) return;
        left_view(root.left);
        System.out.print(root.data + " ");
    }

    private static void right_view(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        right_view(root.right);
    }
}

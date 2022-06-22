public class Main {
    public static void main(String[] args) {

    }
}

class Node {
    int data;
    Node left;
    Node right;

    public static void postOrder(Node root) {
        // Left, right, root
        if (root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data + " ");
    }
}
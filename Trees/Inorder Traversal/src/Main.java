public class Main {
    public static void main(String[] args) {

    }


}


class Node {
    int data;
    Node left;
    Node right;

    public static void inOrder(Node root) {
        // left -> root -> right
        if(root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
}
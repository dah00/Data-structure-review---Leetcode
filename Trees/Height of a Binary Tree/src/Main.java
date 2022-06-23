public class Main {

}

class Node{
    int data;
    Node left;
    Node right;

    public static int height(Node root){
        if(root == null || (root.left == null && root.right == null))
            return 0;
        int heightLeft = 1 + height(root.left);
        int heightRight = 1 + height(root.right);
        return Math.max(heightLeft, heightRight);
    }
}

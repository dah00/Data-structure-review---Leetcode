public class Main {
    public static void main(String[] args) {

    }
}

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){this.data = data;}

    public static Node insert(Node root, int data){
        /*
        if(current == null){
            Node newNode;
            newNode.data = data;
            return newNode;
        }

        if current < newNode
        current.right = insert(current.right, data)
        if(current > newNode)
            current.left = insert(current.left, data)

        current = 4: current < 6 -> current.right = insert(4.right, data)
        current = 7: current > 6 -> current.left = Node(6)
        current = null: return Node(6)
         */

        if(root == null){
            return new Node(data);
        }

        if (root.data < data ){
            root.right = insert(root.right, data);
        }

        if(root.data > data){
            root.left = insert(root.left, data);
        }
        return root;
    }


}

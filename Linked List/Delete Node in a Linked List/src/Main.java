public class Main {
    public static void main(String[] args) {

    }
    /*
        assign the value of the next node to the current node's value
        move to the next node and repeat the process above until the node before the tail node
        assign the value of the tail node to the current node and set next to null
     */

    /*
        Better solution
        node.val = node.next.val;
        node.next = node.next.next;
     */

    public void deleteNode(ListNode node) {
        while(node.next.next != null){
            node.val = node.next.val;
            node = node.next;
        }
        node.val = node.next.val;
        node.next = null;
    }
}

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}
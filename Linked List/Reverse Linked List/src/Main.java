public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode.reverseList(head);
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int x) {val = x; }
    ListNode(int val, ListNode next){this.val = val; this.next = next;}

    public static ListNode reverseList(ListNode head){
        // 1st solution : iterative way
        /*if (head == null || head.next == null)
            return head;

        ListNode newHead = null;
        ListNode iNode = head;
        while (iNode != null){
            ListNode jNode = iNode.next;
            iNode.next = newHead;
            newHead = iNode;
            iNode = jNode;
        }
        return newHead;*/

        // 2nd solution: recursive way
    }
}
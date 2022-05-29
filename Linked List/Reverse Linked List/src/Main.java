public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);


        ListNode.reverseList(head);
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int x) {val = x; }
    ListNode(int val, ListNode next){this.val = val; this.next = next;}



/*    public static ListNode reverseList(ListNode head){
        // 1st solution : iterative way
        *//*if (head == null || head.next == null)
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
/*
    // 2nd solution: recursive way
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode nextNode = head.next;
        ListNode newHead = reverseList(nextNode);
        nextNode.next = head;
        head.next = null;
        return newHead;
    }*/

    // 3rd solution: recursive way with helper function
    public static ListNode reverseList(ListNode head){
        return helper(head, null);
    }

    private static ListNode helper(ListNode head, ListNode newHead){
        if(head == null){
            return newHead;
        }
        ListNode next = head.next;
        head.next = newHead;
        return helper(next, head);
    }
}
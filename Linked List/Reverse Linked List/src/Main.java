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
        // Brute force
        if (head == null || head.next == null)
            return head;

        ListNode curr = head;
        while (curr.next.next != null){
            curr = curr. next;
        }
        ListNode newHead = curr.next;
        curr.next.next = curr;
        curr = head;

        // Check if this condition is corr for single element list
        while(head.next.next != head){
            if(curr.next.next == curr.next){
                curr.next.next = curr;
                curr = head;
            }
            else
                curr = curr.next;
        }

        head.next = null;
        return newHead;

    }
}
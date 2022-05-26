public class Main {
    public static void main(String[] args) {

    }



}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }


    // First Solution : brute force
    /*
    public ListNode removeNthFromEnd(ListNode head, int n){
        // 1. Iterate through the linked list to get the length of the list
        // 2. Remove node at length-n
        if (head == null)
            return head;

        ListNode curr = head;
        int count = 0;
        while (curr != null){
            count++;
            curr = curr.next;
        }


        curr = head;
        for (int i=1; i<count - n; i++){
            curr = curr.next;
        }

        if (count == n)
            head = head.next;
        else
            curr.next = curr.next.next;
        return head;
    }
     */

    // Second solution : 1 iteration
    public ListNode removeNthFromEnd(ListNode head, int n){
        // Have two pointers i and j : place i at the Nth position by using j
        //  i starts at the head of the linked list
        //  j is at i+n-th position
        //      Check if j is null
        //          True: delete node at i-th position
        //          False: move i to the next position

        /* TODO: Have the same concept but
            1. have a newHead(0) pointing to the head
            2. set the gap between iNode and jNode first
            3. make iNode and jNode iterate through the linked list until jNode == null while keeping the gap between them.
            4. Remember to stop at the node before the desired node instead of the stopping at the desired node
        */

        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode slow = newHead;
        ListNode fast = slow;

        for (int i=1; i<=n+1; i++)
            fast = fast.next;

        while (fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return newHead.next;


        // Consider an empty linked list
        // Consider a single element list


    }

}
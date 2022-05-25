public class Main {
    public static void main(String[] args) {

    }



}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

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

}
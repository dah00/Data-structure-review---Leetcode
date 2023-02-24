public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static ListNode swapPairs(ListNode head){
          /*
            1 -> 2 -> 3 -> 4

            if(head == null || head.next == null)
                return head;
            for node 1, 3, 5, 7, ...
                swap(head, head.next);
                return swapPairs(head.next);
           */

        if (head == null || head.next == null) return head;
            ListNode second = head.next;
            ListNode third = second.next;

        second.next = head;
        head.next = swapPairs(third);

        return second;









        /*
            if ((head == null)||(head.next == null))
            return head;
        ListNode n = head.next;
        head.next = swapPairs(head.next.next);
        n.next = head;
        return n;
         */

    }
  }
package com.company;

public class Main {

    public static void main(String[] args) {
	    ListNode head = new ListNode(5);
        head.next = new ListNode(2);
        head.next.next = new ListNode(13);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(8);

        //ListNode modifiedNode = removeNodes(head);


    }

    static ListNode removeNodes(ListNode head){
        /*
            dummy -> 5 -> 2 -> 13 -> 3 -> 8
            dummy 3 -> 19 -> 14 -> 10 -> 18 -> 4 -> 6
            R           R     R           R



            19 -> 18 -> 6
            curr: 5. Is 2 > 5 No, 13 > 5 Yes REMOVE 5
            curr: 2. Is 13 > 2 Yes, REMOVE 2
            curr: 13. Is 3 > 13 No, Is 8 > 13 No    KEEP 13
            curr: 3. Is 8 > 3 Yes, REMOVE 3
            curr: 8.

            1. When removing a node:
                - Check if current node is the head. If head, reassign head = head.next

            Goal: If the value of the current is less than one of the right side's node value, then remove it.

            Base case: (When the last node is reached) <=> if head == null OR head.next == null

         */
        if (head != null) {
            head.next = removeNodes(head.next);
            if (head.next != null && head.val < head.next.val) {
                return head.next;
            }
        }
        return head;
    }
}

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class Main {
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int x) {
        val = x;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static boolean isPalindrome(ListNode head){
        Stack<Integer> stack = new Stack<>();
        ListNode curr = head;
        while (curr!=null){
            stack.push(curr.val);
            curr = curr.next;
        }

        curr = head;
        while (curr!=null){
            if (curr.val != stack.pop())
                return false;
            curr = curr.next;
        }
        return true;
    }
}
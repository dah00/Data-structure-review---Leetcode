public class Main {
    public static void main(String[] args) {

    }
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

    private ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode newHead = null;
        ListNode curr = null;
        while(list1 != null || list2 != null){
            if(list1 != null && list2 != null && list1.val <= list2.val){
                if (newHead == null){
                    newHead = new ListNode(list1.val);
                    curr = newHead;
                }
                else {
                    curr.next = new ListNode(list1.val);
                    curr = curr.next;
                }
                list1 = list1.next;
            }
            else if(list1 != null && list2 != null && list2.val < list1.val){
                if (newHead == null){
                    newHead = new ListNode(list2.val);
                    curr = newHead;
                }
                else {
                    curr.next = new ListNode(list2.val);
                    curr = curr.next;
                }
                list2 = list2.next;
            }
            if(list1 == null && list2 != null){
                while(list2 != null){
                    if (newHead == null){
                        newHead = new ListNode(list2.val);
                        curr = newHead;
                    }
                    else {
                        curr.next = new ListNode(list2.val);
                        curr = curr.next;
                    }
                    list2 = list2.next;
                }
            }
            else if (list2 == null && list1 != null){
                while (list1 != null){
                    if (newHead == null){
                        newHead = new ListNode(list1.val);
                        curr = newHead;
                    }
                    else {
                        curr.next = new ListNode(list1.val);
                        curr = curr.next;
                    }
                    list1 = list1.next;
                }
            }
        }

        return newHead;
    }
}
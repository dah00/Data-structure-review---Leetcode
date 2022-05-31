public class Main {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode.mergeTwoLists(list1, list2);
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

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2){

        if(list1 == null)
            return list2;
        if(list2 == null){
            return list1;
        }
        if(list1.val <= list2.val){
            list1.next =  mergeTwoLists(list1.next, list2);
            return list1;
        }
        else{
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }



        // Brute force solution

        /*ListNode newHead = null;
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

        return newHead;*/
    }
}
import java.util.*;
class RemoveD {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next==null)
            return head;
        ListNode list = head;
        while(list.next != null)
        {
            if(list.val == list.next.val)
                list.next=list.next.next;
            else
                list=list.next;
        }
        return head;
    }
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }
}
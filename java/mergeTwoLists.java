class mergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
          return list2;
      }
      if(list2 == null){
          return list1;
      }
      ListNode head;
      ListNode temp;
      if(list1.val > list2.val) {
          temp = head = new ListNode(list2.val);
          list2 = list2.next;
      }else{
          temp = head = new ListNode(list1.val);
          list1 = list1.next;
      }
      while(list1 != null || list2 != null) {
          if(list1 == null && list2 !=null) {
              temp.next = new ListNode(list2.val);
              list2 = list2.next;
          } else if (list1 != null && list2 == null) {
              temp.next = new ListNode(list1.val);
              list1 = list1.next;                
          } else {
              if(list1.val > list2.val){
                  temp.next = new ListNode(list2.val);
                  list2 = list2.next;
              }else{
                  temp.next = new ListNode(list1.val);
                  list1 = list1.next;
              }
          }
          temp = temp.next;
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
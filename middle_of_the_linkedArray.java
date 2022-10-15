
class Solution {
    public ListNode middleNode(ListNode head) {
         ListNode start=head;
         ListNode end=head;
           while(start!=null&&start.next!=null){
                   start=start.next.next;
                   end=end.next;
                   
                  }
    
        return end;
    }
}

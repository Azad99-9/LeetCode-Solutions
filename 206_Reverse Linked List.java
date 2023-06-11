
class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode ptr= null;
        if(head != null){

        ptr= head;
        ListNode pre= null;
        ListNode next= ptr.next;

        while(next != null){

            ptr.next= pre;
            pre= ptr;
            ptr= next;
            next= ptr.next;

        }
        ptr.next = pre;


        }
        return ptr;

    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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

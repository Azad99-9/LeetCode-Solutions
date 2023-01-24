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

//T- O(n/k)*k = n
//s- O(1)

class Solution {
    public int lengthOfLinkedList(ListNode head) {
        int length = 0;
        while(head != null) {
            length++;
            head = head.next;
        }
        return length;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null) return head;

        int length = lengthOfLinkedList(head);

        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;

        ListNode pre = dummyHead;
        ListNode cur;
        ListNode nex;

        while(length >= k) {
            cur = pre.next;
            nex = cur.next;
            for(int i= 1; i<k; i++) {
                cur.next = nex.next;
                nex.next = pre.next;
                pre.next = nex;
                nex = cur.next;
            }
            pre = cur;
            length-=k;
        }

        return dummyHead.next;
    }
}

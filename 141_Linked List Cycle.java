/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
//time O(n)
//space O(1)

public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;

        ListNode hare = head;
        ListNode tortoise = head;

        while(hare.next != null && hare.next.next != null) {
            hare = hare.next.next;
            tortoise = tortoise.next;
            if(hare == tortoise) return true;
        }

        return false;

        
    }
}

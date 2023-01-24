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
    public ListNode reverse(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while(cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;

        ListNode hare = head;
        ListNode tur = head;

        while(hare.next != null && hare.next.next != null) {
            tur = tur.next;
            hare = hare.next.next;
        }

        tur.next = reverse(tur.next);

        tur = tur.next;

        while(tur != null) {
            if(head.val != tur.val)
                return false;
            tur = tur.next;
            head = head.next;
        }

        return true;
    }
}

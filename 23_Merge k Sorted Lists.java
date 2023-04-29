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
    ListNode merge (ListNode i, ListNode j) {
        ListNode dummy = new ListNode();
        if (i == null) return j;
        if (j == null) return i;
        ListNode ptr = dummy;
        ListNode temp = null;

        while (i != null && j != null) {
            if (i.val < j.val) {
                ptr.next = i;
                temp = i.next;
                i.next = null;
                i = temp;
            } else {
                ptr.next = j;
                temp = j.next;
                j.next = null;
                j = temp;
            }
            ptr = ptr.next;
        }
        if (i != null) ptr.next = i;
        if (j != null) ptr.next = j;

        return dummy.next;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode finalList = null;

        for (int i = 0; i < lists.length; i++) {
            finalList = merge(finalList, lists[i]);
        }

        return finalList;
    }
}

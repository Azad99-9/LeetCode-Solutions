/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//time O(1)
//space O(1)

class Solution {
    public void deleteNode(ListNode node) {
        int temp = node.next.val;
        node.next = node.next.next;
        node.val = temp;
    }
}

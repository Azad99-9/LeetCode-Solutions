class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }
        ListNode mid = getmid(head);
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        ListNode reverse = reverseList(mid);
        while(head != mid  && reverse != null){
            temp.next = head;
            head = head.next;
            temp = temp.next;
            temp.next = reverse;
            reverse = reverse.next;
            temp = temp.next;
        }
        return;
    }

    public ListNode getmid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverseList(ListNode node) { 	
    	ListNode prev = node;
        ListNode cur = node.next;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = prev;

            prev = cur;
            cur = next;
        }
        node.next = null;
        return prev;
    }
}

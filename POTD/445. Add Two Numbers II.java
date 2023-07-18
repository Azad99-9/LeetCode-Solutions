class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> st1= new Stack<>();
        Stack<Integer> st2= new Stack<>();

        ListNode ptr = l1;
        while (ptr != null) {
            st1.push(ptr.val);
            ptr = ptr.next;
        }

        ptr = l2;
        while (ptr !=  null) {
            st2.push(ptr.val);
            ptr = ptr.next;
        }

        // ListNode dum = new ListNode(-1, null);
        ListNode next = null;
        ptr = null;
        int cary = 0;
        while (!st1.isEmpty() && !st2.isEmpty()) {
            int cur = cary + st1.pop();
            cur += st2.pop();
            cary = cur / 10;
            ptr = new ListNode(cur%10, next);
            next = ptr;
        }
        while (!st1.isEmpty()) {
            int cur = cary + st1.pop();
            cary = cur / 10;
            ptr = new ListNode(cur%10, next);
next = ptr;
        }
        while (!st2.isEmpty()) {
            int cur = cary + st2.pop();
            cary = cur / 10;
            ptr = new ListNode(cur%10, next);
next = ptr;
        }
        if(cary!=0) {
            ptr = new ListNode(cary, next);
            next = ptr;
        }

        return ptr;
    }
}
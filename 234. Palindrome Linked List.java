class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode ptr = head;
        long num = 0;
        long rev = 0;
        long pow = 1;
        while (ptr != null) {
            num = (num*10) + ptr.val;
            rev = rev + (ptr.val*pow);
            pow*=10;
            ptr = ptr.next;
        }

        return num == rev;
    }
}
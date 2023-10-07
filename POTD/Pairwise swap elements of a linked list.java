class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head)
    {
        if (head == null || head.next == null) return head;
        
        Node ans = head.next;
        
        Node c = head;
        Node p = null;
        
        while (c != null && c.next != null) {
            Node n = c.next;
            if (p != null) p.next = n;
            if (n != null) c.next = n.next;
            n.next = c;
            p = c;
            c = p.next;
        }
        
        return ans;
    }
}
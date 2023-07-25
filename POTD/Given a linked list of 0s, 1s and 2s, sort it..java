
/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        int[] freq = new int[3];
        Node ptr = head;
        while (ptr != null) {
            freq[ptr.data]++;
            ptr = ptr.next;
        }
        ptr = head;
        int i = 0;
        while (ptr != null && i < 3) {
            if (freq[i] != 0) {
                ptr.data = i;
                ptr = ptr.next;
                freq[i]--;
            } else {
                i++;
            }
        }
        
        return head;
    }
}
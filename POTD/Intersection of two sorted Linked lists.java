class Solution
{
   public static Node findIntersection(Node head1, Node head2)
    {
        Node i = head1;
        Node j = head2;
        
        Node ans = new Node(-1);
        Node cur = ans;
        
        while (i != null && j != null) {
            if (i.data == j.data) {
                Node t = new Node(i.data);
                cur.next = t;
                cur = t;
                i = i.next;
                j = j.next;
            } else if (i.data < j.data) {
                i = i.next;
            } else {
                j = j.next;
            }
        }
        
        return ans.next;
    }
}

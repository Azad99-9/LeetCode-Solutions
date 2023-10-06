class Solution
{
    public static void rearrange(Node odd)
    {
        Node c = odd;
        Node t = c.next;
        Node pt = null;
        while (c != null && t != null) {
            c.next = t.next;
            t.next = pt;
            pt = t;
            if (c.next == null) {
                c.next = pt;
                break;
            } else c = c.next;
            t = c.next;
        }
        if (t == null) c.next = pt;
        
    }
}
public static Node reverseDLL(Node  head)
{
    Node cur = head;
    Node prev = null;
    
    while (cur != null) {
        Node x = cur.next;
        Node t = cur.next;
        cur.next = cur.prev;
        cur.prev = t;
        prev = cur;
        cur = x;
    }
    
    return prev;
}

/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        // T - O( N )
        // S - O( 1 )
        if(root == null) return null;
        if(root.left == null && root.right == null) return root;
        Node cur = root;
        Node next = cur.left;
        cur.next = null;
        while(next != null) {
            cur.left.next = cur.right;
            if(cur.next != null)
                cur.right.next = cur.next.left;

            cur = cur.next;
            if(cur == null) {
                cur = next;
                next = cur.left;
            }
        }
        return root;
    }
}

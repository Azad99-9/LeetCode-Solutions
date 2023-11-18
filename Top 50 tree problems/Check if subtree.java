class Solution {
    private static boolean isSame(Node t, Node s) {
        if (s == null && t == null) return true;
        if (s == null && t != null) return false;
        if (s != null && t == null) return false;
        
        return (t.data == s.data && isSame(t.left, s.left) && isSame(t.right, s.right));
    }
    
    private static boolean isSubtreeAt(Node t, Node s) {
        if (t == null) return false;
        return isSame(t, s) || isSubtreeAt(t.left, s) || isSubtreeAt(t.right, s);
    }
    
    public static boolean isSubtree(Node t, Node s) {
        if (s == null) return true; // An empty tree is always a subtree
        if (t == null) return false;

        return isSubtreeAt(t, s);
    }
}

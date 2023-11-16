class GfG
{
    // return true/false denoting whether the tree is Symmetric or not
    private static boolean isSame(Node r1, Node r2) {
        if (r1 == null && r2 == null) return true;
        
        if (r1 == null && r2 != null) return false;
        if (r2 == null && r1 != null) return false;
        
        return (isSame(r1.left, r2.right) && isSame(r1.right, r2.left) && r1.data == r2.data);
    }
    public static boolean isSymmetric(Node root)
    {
        if (root == null) return true;
        
        return isSame(root.left, root.right);
    }
}

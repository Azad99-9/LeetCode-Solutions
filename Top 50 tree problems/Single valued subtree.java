class Solution
{
    private int[] recur(Node root) {
        if (root == null) return new int[2];
        
        if (root.left == null && root.right == null) return new int[]{root.data, 1};
        
        int[] l = recur(root.left);
        int[] r = recur(root.right);
        
        int cur = 0;
        if (root.left != null) cur = l[1];
        if (root.right != null) cur += r[1];
        
        int lel = root.data;
        int rel = root.data;
        
        if (root.left != null) lel = l[0];
        if (root.right != null) rel = r[0];
        
        
        
        if (lel == root.data && rel == root.data) return new int[]{root.data, 1 + cur};
        else return new int[]{-1, cur}; 
        
    }
    public int singlevalued(Node root)
    {
        return recur(root)[1];
    }
}

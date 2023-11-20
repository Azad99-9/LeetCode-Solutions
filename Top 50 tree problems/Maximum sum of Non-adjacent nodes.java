class Solution
{
    //Function to return the maximum sum of non-adjacent nodes.
    static int[] help(Node root) {
        if (root == null) return new int[]{0,0};
        
        int[] l = help(root.left);
        int[] r = help(root.right);
        
        int[] p = new int[2];
        p[0] = root.data + l[1] + r[1];
        p[1] = Math.max(l[0], l[1]) + Math.max(r[0], r[1]);
        
        return p;
    }
    static int getMaxSum(Node root)
    {
        int[] a = help(root);
        return Math.max(a[0], a[1]);
    }
}


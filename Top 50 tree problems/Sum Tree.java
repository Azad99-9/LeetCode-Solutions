class Solution
{
    boolean ans = true;
    
    int helper(Node root) {
        if (root == null) return 0;
        
        if (root.left == null && root.right == null) return root.data;
        
        int l = helper(root.left);
        
        if (!ans) return -1;
        
        int r = helper(root.right);
        
        if (!ans) return -1;
        
        // System.out.println(root.data + " " + l + r);
        if (root.data != (l + r)) {
            ans = false;
            return -1;
        }
        
        
        return root.data + l + r;
    }
    
	boolean isSumTree(Node root)
	{
        helper(root);
        
        return ans;
	}
}


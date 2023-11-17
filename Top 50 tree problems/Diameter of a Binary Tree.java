class Solution {
    // Function to return the diameter of a Binary Tree.
    int diam = 1;
    
    int helper(Node root) {
        if (root == null) return 0;
        
        int left = helper(root.left);
        int right = helper(root.right);
        
        int cur = 1 + left + right;
        diam = Math.max(diam, cur);
        
        return 1 + Math.max(left, right);
    }
    
    int diameter(Node root) {
        helper(root);
        return diam;
    }
}


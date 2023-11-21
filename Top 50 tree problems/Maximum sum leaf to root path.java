public static int maxPathSum(Node root)
    {
        if (root == null) return Integer.MIN_VALUE;
        
        int l = maxPathSum(root.left);
        int r = maxPathSum(root.right);
        
        int add = Math.max(l, r);
        return root.data + (add == Integer.MIN_VALUE ? 0 : add);
    }
}

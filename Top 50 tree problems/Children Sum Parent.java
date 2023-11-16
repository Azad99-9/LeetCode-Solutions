class Tree
{
    //Function to check whether all nodes of a tree have the value 
    //equal to the sum of their child nodes.
    public static int isSumProperty(Node root)
    {
        if (root == null) return 1;
        if (root.left == null && root.right == null) return 1;
        
        int left = isSumProperty(root.left);
        int right = isSumProperty(root.right);
        
        int ts = 0;
        if (root.left != null) ts += root.left.data;
        if (root.right != null) ts += root.right.data;
        
        if (ts == root.data && left == 1 && right == 1) return 1;
        return 0;
        
    }
}

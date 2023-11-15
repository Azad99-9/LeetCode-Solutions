class Solution
{
    //Function to check whether a Binary Tree is BST or not.
    boolean recur(Node root, int min, int max) {
        if (root == null) return true;
        
        if (root.data > min && root.data < max && recur(root.left, min, root.data) && recur(root.right, root.data, max)) return true;
    
        else return false;
    }
    
    boolean isBST(Node root)
    {
        return recur(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}

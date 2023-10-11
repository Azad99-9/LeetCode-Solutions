class Tree
{
    
    //Function to check whether a binary tree is balanced or not.
    private int checkBalance(Node root) {
        if (root == null) return 0;
	    
	    int leftHeight = checkBalance(root.left);
	    if (leftHeight < 0) return -1;
	    
	    int rightHeight = checkBalance(root.right);
	    if (rightHeight < 0) return -1;
	    
	    int balance = Math.abs(leftHeight - rightHeight);
	    if (balance > 1) return -1;
	    else return 1 + Math.max(leftHeight, rightHeight);
    }
    
    boolean isBalanced(Node root)
    {
	    if (checkBalance(root) < 0) return false;
	    return true;
    }
}

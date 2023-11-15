class Solution
{
    //Function to check if two trees are identical.
	boolean isIdentical(Node r1, Node r2)
	{
	    if (r1 == null && r2 != null) return false;
	    if (r1 != null && r2 == null) return false;
	    
	    if (r1 == null && r2 == null) return true;
	    
	    if (isIdentical(r1.left, r2.left) &&
	    isIdentical(r1.right, r2.right) && r1.data == r2.data) return true;
	    
	    return false;
	}
	
}

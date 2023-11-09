class Solution
{
    List<Integer> arrS= new ArrayList<>();//to store the node value in sorted manner  
    
    public void inorder(TreeNode root) 
    {//BST of inorder is sorted 
        if (root == null)//base case when we reach to the null node 
            return;//deleting the current activation block and returning to the parent 
        
        inorder(root.left);//recursing down the left subtree 
        
        arrS.add(root.val);//manipulating the root// adding the node value in ascending order 
        
        inorder(root.right);//recursing down the right subtree 
        
        return;//deleting the current activation block and returning to the parent, as all thefunctions are completed 
    }
    
    public TreeNode createBST(int low, int high) 
    {//postorder, bottom up approach is used because we want to know the child first then the parent 
        if(low > high)//base case //not creating any further node on wrong index 
           return null;
        
        int mid= low + (high - low)/2;//getting the middle index at every activation block 
        
        int data= arrS.get(mid);//getting the data in the middle index 
        
        //----Left----(Mid)----Right----
        
        TreeNode left= createBST(low, mid - 1);//recursing down in the left subtree in search of child, is there or null is returned //lower bound
        TreeNode right= createBST(mid + 1, high);//recursing down in the right subtree in search of child, is there or null//upper bound 
        
        TreeNode node= new TreeNode(data, left, right);//finally creating root node after knowing the reference of the children(left, right)
       
        return node;//return the node to its parent for backward linking//to tell that I am present 
    }
    
    public TreeNode balanceBST(TreeNode root) 
    {
        TreeNode rootN= null;
        if(root == null)//when we are provided with null graph 
            return rootN;
        
        inorder(root);//creates the sorted ArrayList 
        rootN= createBST(0, arrS.size() - 1);//creates the tree and returns the root, because root is the last node created as it takes time to get left and right child information since we are doing postorder traversal 
        return rootN;
    }
}//please do Upvote, it helps a lot

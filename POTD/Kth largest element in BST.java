class Solution
{
    // return the Kth largest element in the given BST rooted at 'root'
    int cnt = 0;
    int ans = 0;
    private void inorder(Node root, int k) {
        if (root == null) return;
        
        inorder(root.right, k);
        cnt++;
        if (cnt == k) ans = root.data; 
        inorder(root.left, k);
        
        
    }
    
    public int kthLargest(Node root,int k)
    {
        inorder(root, k);
        return ans;
    }
}
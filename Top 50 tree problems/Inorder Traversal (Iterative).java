class Solution
{
    // Return a list containing the inorder traversal of the given tree
    ArrayList<Integer> inOrder(Node root)
    {
        Stack<Node> stk = new Stack<>();
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        Node cur = root;
        
        while (cur != null || !stk.isEmpty()) {
            while (cur != null) {
                stk.push(cur);
                ans.add(cur.data);
                cur = cur.left;
            }
            
            cur = stk.pop().right;
            
            
        }
        
        return ans;
    }
    
    
}

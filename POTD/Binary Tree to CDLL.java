class Solution
{ 
    //Function to convert binary tree into circular doubly linked list.
    Node bTreeToClist(Node root)
    {
        boolean flag = false;
        Node cur = root;
        Node newHead = null;
        Node prev = null;
        
        Stack<Node> stk = new Stack<>();
        
        while (cur != null || !stk.isEmpty()) {
            while (cur != null) {
                stk.push(cur);
                cur = cur.left;
            }
            
            cur = stk.pop();
            if (!flag) {
                newHead = cur;
                flag = true;
            }
            
            cur.left = prev;
            if (prev != null) prev.right = cur;
            
            prev = cur;
            
            cur = cur.right;
        }
        
        prev.right = newHead;
        newHead.left = prev;
        
        return newHead;
    }
    
}
    


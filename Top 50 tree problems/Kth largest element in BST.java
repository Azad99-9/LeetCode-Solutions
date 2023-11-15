class Solution
{
    // return the Kth largest element in the given BST rooted at 'root'
    
    public int kthLargest(Node root,int K)
    {
        int n = 0;
        
        Stack<Node> stk = new Stack<>();
        int i = 0;
        
        
        Node cur = root;
        
        while (cur != null || !stk.isEmpty()) {
            while (cur != null) {
                stk.push(cur);
                cur = cur.left;
            }
            
            cur = stk.pop();
            // System.out.println(cur.data);
            n++;
            
            cur = cur.right;
        }
        
        stk = new Stack<>();

        K = n - K+1;
        cur = root;

        while (cur != null || !stk.isEmpty()) {
            while (cur != null) {
                stk.push(cur);
                cur = cur.left;
            }
            
            cur = stk.pop();
            // System.out.println(cur.data);
            i++;
            if (i == K) return cur.data;
            
            cur = cur.right;
        }
        
        return -1;
    }
}

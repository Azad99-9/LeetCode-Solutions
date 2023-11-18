class Solution
{
    //Function to connect nodes at same level.
    public void connect(Node root)
    {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        
        while (!q.isEmpty()) {
            int size = q.size();
            
            Node prev = q.peek();
            for (int i = 0; i < size; i++) {
                Node cur = q.poll();
                if (cur.left != null) q.offer(cur.left);
                if (cur.right != null) q.offer(cur.right);
                
                if (i > 0) {
                    prev.nextRight = cur;
                    prev = cur;
                }
            }
            
            prev.nextRight = null;
        }
    }
}

class Solution
{
	int getLevelDiff(Node root)
	{
	    int level = 1;
	    Queue<Node> q = new LinkedList<>();
	    q.offer(root);
	    
	    int odd = 0;
	    int even = 0;
	    
	    while (!q.isEmpty()) {
	        int size = q.size();
	        for (int i = 0; i < size; i++) {
	            Node cur = q.poll();
	            if (cur.left != null) q.offer(cur.left);
	            if (cur.right != null) q.offer(cur.right);
	            if (level % 2 == 0) even += cur.data;
	            else odd += cur.data;
	        }
	        level++;
	    }
	    
	    return odd - even;
	}
}

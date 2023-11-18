class GFG
{
    //Function to store the zig zag order traversal of tree in a list.
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	    int level = 0;
	    Queue<Node> q = new LinkedList<>();
	    q.offer(root);
	    
	    boolean reverse = false;
	    
	    ArrayList<Integer> ans = new ArrayList<>();
	    
	    while (!q.isEmpty()) {
	        int size = q.size();
	        
	        if (level % 2 != 0) reverse = true;
	        else reverse = false;
	        
	        ArrayList<Integer> tmp = new ArrayList<>();
	        
	        for (int i = 0; i < size; i++) {
	            Node cur = q.poll();
	            tmp.add(cur.data);
	            
	           if (cur.left != null) q.offer(cur.left);   
	           if (cur.right != null) q.offer(cur.right);
	            
	        }
	        
	        level++;
	        
	        if (reverse) Collections.reverse(tmp);
	        ans.addAll(tmp);
	    }
	    
	    return ans;
	}
}

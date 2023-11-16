class Solution
{
    public ArrayList<Integer> largestValues(Node root)
    {
	    Queue<Node> q = new LinkedList<>();
	    q.offer(root);
	    
	    ArrayList<Integer> ans = new ArrayList<>();
	    while (!q.isEmpty()) {
	        int size = q.size();
	        int maxi = Integer.MIN_VALUE;
	        for (int i = 0; i < size; i++) {
	            Node cur = q.poll();
	            if (cur.left != null) q.offer(cur.left);
	            if (cur.right != null) q.offer(cur.right);
	            maxi = Math.max(maxi, cur.data);
	        }
	        ans.add(maxi);
	    }
	    
	    return ans;
    }
}

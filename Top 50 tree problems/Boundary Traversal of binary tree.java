class Solution
{
    void left (Node root, ArrayList<Integer> ans) {
        if (root == null) return;
        
        ans.add(root.data);
        if (root.left != null) left(root.left, ans);
        else if (root.right != null) left(root.right, ans);
    }
    
    void right (Node root, ArrayList<Integer> ans) {
        if (root == null) return;
        
        ans.add(root.data);
        if (root.right != null) right(root.right, ans);
        else if (root.left != null) right(root.left, ans);
    }
    
    void leaves(Node root, ArrayList<Integer> ans) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
             ans.add(root.data);
             return;
        }
        
        leaves(root.left, ans);
        leaves(root.right, ans);
    }
    
	ArrayList <Integer> boundary(Node node)
	{
	    ArrayList <Integer> ans = new ArrayList<>();
	    ans.add(node.data);
	    
	    if (node.left == null && node.right == null) return ans;
	    
	    left(node.left, ans);
	    
	   // System.out.println(ans);
	    if (ans.size() > 1) ans.remove(ans.size() - 1);
	    
	    leaves(node, ans);
	    
	    ArrayList<Integer> tmp = new ArrayList<>();
	    
	    right(node.right, tmp);
	    
	    if (!tmp.isEmpty()) tmp.remove(tmp.size() - 1);
	    
	    Collections.reverse(tmp);
	    
	    ans.addAll(tmp);
	    
	    return ans;
	}
}


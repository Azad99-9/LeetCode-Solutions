class Solution
{
    
    private static boolean postOrder(Node root, ArrayList<Integer> ans, int target) {
        if (root == null) return false;
        
        boolean done = false;
        if(target == root.data) return true;
        ans.add(root.data);
        if (!done) done = postOrder(root.left, ans, target);
        if (!done) done = postOrder(root.right, ans, target);
        
        if (done) return true;
        ans.remove(ans.size() - 1);
        
        return false;
        
    }
    public static ArrayList<Integer> Ancestors(Node root, int target)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        postOrder(root, ans, target);
        Collections.reverse(ans);
        return ans;
    }
}

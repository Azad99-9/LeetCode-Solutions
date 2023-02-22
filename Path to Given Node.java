/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
	// T - O( n )
	// S - O( n )
    public boolean inorder(TreeNode root, int B, ArrayList<Integer> ans) {
        if(root == null) return false;
        ans.add(root.val);
        if(inorder(root.left, B, ans))
            return true;
        if(root.val == B)
            return true;
        if(inorder(root.right, B, ans))
            return true;
        ans.remove(ans.size() - 1);
        return false;
    }
    
    public int[] solve(TreeNode A, int B) {
        ArrayList<Integer> ans = new ArrayList<>();
        inorder(A, B, ans);
        int[] res = new int[ans.size()];
        for(int i = 0; i < res.length; i++)
            res[i] = ans.get(i);
        return res;
    }
}


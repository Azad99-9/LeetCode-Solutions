/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
	// T - O( N )
	// S - O( 1 )

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
     if(root == null) return root;
     if(root.val > p.val && root.val > q.val) return lowestCommonAncestor(root.left, p, q);
     if(root.val < p.val && root.val < q.val) return lowestCommonAncestor(root.right, p, q);
     else return root;
    }
}

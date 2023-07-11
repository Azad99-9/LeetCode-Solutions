/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int minDepth(TreeNode root) {
        int depth = 0; 
        if (root == null) return 0;

        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if (left == 0 || right == 0) depth = 1+Math.max(left, right);
        else depth = 1+Math.min(left, right);

        return depth;

    }
}
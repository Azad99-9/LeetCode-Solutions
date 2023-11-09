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
    private boolean isSame(TreeNode r1, TreeNode r2) {
        if (r1 == null && r2 != null) return false;
        if (r1 != null && r2 == null) return false;

        if (r1 == null && r2 == null) return true;

        if (r1.val != r2.val) return false;

        return isSame(r1.left, r2.left) && isSame(r1.right, r2.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;

        boolean same = false;
        if (root.val == subRoot.val) 
            same = isSame(root, subRoot);

        if (same) return true;

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
}

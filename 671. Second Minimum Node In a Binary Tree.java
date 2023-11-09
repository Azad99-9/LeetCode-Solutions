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
    private long first_min = Long.MAX_VALUE;
    private long second_min = Long.MAX_VALUE;

    private boolean isLeaf(TreeNode root) {
        return (root.left == null && root.right == null);
    }

    private void preorder(TreeNode root) {
        if (root == null) return;
        
        if (isLeaf(root)) {
            if (first_min > root.val) {
                second_min = first_min;
                first_min = (long)root.val;
            } else if (second_min > root.val && root.val != first_min) {
                second_min = (long)root.val;
            }
        }

        preorder(root.left);
        preorder(root.right);
    }

    public int findSecondMinimumValue(TreeNode root) {
        preorder(root);
        if (second_min == first_min) return -1;
        if (second_min == Long.MAX_VALUE) return -1;
        return (int)second_min;
    }
}

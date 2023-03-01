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
    // T - O( N )
    // S - O( 1 )
    int cnt = 0; int ans = 0;
    public boolean inorder(TreeNode root, int k) {
        if(root != null) {
            if(inorder(root.left, k)) return true;
            cnt++;
            if(cnt == k) {
                ans = root.val; 
                return true;
            }
            if(inorder(root.right, k)) return true;
        }
        return false;
    }

    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return ans;
    }
}

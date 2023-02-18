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
        public void preorder(TreeNode root) {
             // T - O( N )
             // S - O( N )
            if(root != null) {
                ans.add(root.val);
                preorder(root.left);
                preorder(root.right);
            }
        }

        List<Integer> ans = new LinkedList<>();
        public List<Integer> preorderTraversal(TreeNode root) {
            preorder(root);
            return ans;
        }
    
}

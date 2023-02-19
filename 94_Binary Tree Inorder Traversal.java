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
    public List<Integer> inorderTraversal(TreeNode root) {
        // T - O( N )
        // S - O( 1 )
        ArrayList<Integer> inorder = new ArrayList<>();
        TreeNode current = root;
        while(current != null) {
            if(current.left == null) {
                inorder.add(current.val);
                current = current.right;
            } else {
                TreeNode prev = current.left;
                while(prev.right != null && prev.right != current) {
                    prev = prev.right;
                }

                if(prev.right == null) {
                    prev.right = current;
                    current = current.left;
                } else {
                    prev.right = null;
                    inorder.add(current.val);
                    current = current.right;
                }
            }
        }
        return inorder;
    }
}

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
    public TreeNode helper(int[] arr, int bound, int[] i) {
        if(i[0] == arr.length || arr[i[0]] > bound) return null;
        TreeNode root = new TreeNode(arr[i[0]++]);
        root.left = helper(arr, root.val, i);
        root.right = helper(arr, bound, i);
        return root;
    }

    public TreeNode bstFromPreorder(int[] preorder) {
        return helper(preorder, Integer.MAX_VALUE, new int[]{0});
    }
}

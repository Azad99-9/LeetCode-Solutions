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

// T - O( N )
// S - O( N )

class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder == null || postorder == null || inorder.length != postorder.length) return null;

        HashMap<Integer, Integer> inMap = new HashMap<Integer, Integer>();

        for(int i = 0; i < inorder.length; i++) inMap.put(inorder[i], i);

        return buildTreePostIn(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1, inMap);
    }

    public TreeNode buildTreePostIn(int[] inorder, int inStart, int inEnd, int[] postorder, int poStart, int poEnd, HashMap<Integer, Integer> inMap) {
        if(poStart > poEnd || inStart > inEnd) return null;

        TreeNode root = new TreeNode(postorder[poEnd]);

        int inRoot = inMap.get(postorder[poEnd]);
        int numsLeft = inRoot - inStart;
        root.left = buildTreePostIn(inorder, inStart, inRoot - 1, postorder, poStart, poStart + numsLeft - 1, inMap);
        root.right = buildTreePostIn(inorder, inRoot + 1, inEnd, postorder, poStart + numsLeft, poEnd - 1, inMap);

        return root;
    }
}

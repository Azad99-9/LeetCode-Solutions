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
class BSTIterator {
    private Stack<TreeNode> stack = new Stack<TreeNode>();
    // S - O( H )

    public BSTIterator(TreeNode root) {
        pushAll(root);
    }
    
    public int next() {
        // T - O( 1 )
        TreeNode tmpNode = stack.pop();
        pushAll(tmpNode.right);
        return tmpNode.val;
    }
    
    public boolean hasNext() {
        // T - O( 1 )
        return !stack.isEmpty();
    }

    private void pushAll(TreeNode node) {
        // T - O( H )
        for(; node != null; stack.push(node), node = node.left);
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */

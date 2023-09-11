class Solution {
    public boolean isLeaf(TreeNode root) {
        return root.left == null && root.right == null;
    }

    public boolean dfs(TreeNode root, int curSum, int targetSum) {
        if (root == null) return false;
        curSum += root.val;
        if (isLeaf(root)) {
            return curSum == targetSum;
        }

        return dfs(root.left, curSum, targetSum) || dfs(root.right, curSum, targetSum);
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root, 0, targetSum);
    }
}
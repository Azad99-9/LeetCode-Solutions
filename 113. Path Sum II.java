class Solution {
    private boolean isLeaf(TreeNode root) {
        return root.left == null && root.right == null;
    }

    private void dfs(TreeNode root, List<List<Integer>> ans, List<Integer> cur, int targetSum, int curSum) {
        if (root == null) return;

        cur.add(root.val);
        curSum += root.val;

        if (isLeaf(root)) {
            if (curSum == targetSum)
                ans.add(new ArrayList<>(cur));
            
            cur.remove(cur.size()-1);
            return;
        }

        dfs(root.left, ans, cur, targetSum, curSum);
        dfs(root.right, ans, cur, targetSum, curSum);

        cur.remove(cur.size() -1);
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(root, ans, new ArrayList<>(), targetSum, 0);
        return ans;
    }
}
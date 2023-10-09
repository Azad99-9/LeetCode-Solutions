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
    private List<TreeNode> generateTree(Map<Integer, List<TreeNode>> map, int n) {
        // Map<Integer, List<TreeNode>> map --> List<TreeNode> represents all full trees possible with Integer n nodes

        if (n == 1) {
            List<TreeNode> node = new ArrayList<>();
            node.add(new TreeNode(0));
            return node;
        }

        if (map.containsKey(n)) return map.get(n);

        List<TreeNode> ans = new ArrayList<>();

        for (int left = 0; left < n; left++) {
            int right = n - left - 1;
            List<TreeNode> leftTrees = generateTree(map, left);
            List<TreeNode> rightTrees = generateTree(map, right);

            for(TreeNode l : leftTrees) {
                for (TreeNode r: rightTrees) {
                    TreeNode root = new TreeNode(0);
                    root.left = l;
                    root.right = r;
                    ans.add(root);
                }
            }
        }

        map.put(n, ans);
        return ans;
    }
    public List<TreeNode> allPossibleFBT(int n) {
        if (n == 0 || n % 2  == 0) return new ArrayList<>();
        Map<Integer, List<TreeNode>> map = new HashMap<>();
        return generateTree(map, n);
    }
}
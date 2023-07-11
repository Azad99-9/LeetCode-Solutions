/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    public TreeNode inorder(TreeNode root, TreeNode target, Map<TreeNode, TreeNode> map, TreeNode parent) {
        if (root == null) return null;
        TreeNode ans = null;
        TreeNode left = inorder(root.left, target, map, root);
        if (left != null) ans = left;
        map.put(root, parent);
        if (root.val == target.val) {
            ans = root;
        }
        TreeNode right = inorder(root.right, target, map, root);
        if (right != null) ans = right;
        return ans;
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode, TreeNode> map = new HashMap<>();
        target = inorder(root, target, map, null);
        boolean[] vis = new boolean[501];
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(target);
        
        k++;
        while (!q.isEmpty() && k > 0)  {
            int size = q.size();
            k--;
            if (k == 0) {
                List<Integer>  ans = new LinkedList<>();
                for (int i = 0; i < size; i++) ans.add(q.poll().val);
                return ans;
            }
            else {
                for (int i = 0; i < size; i++) {
                    TreeNode cur = q.poll();
                    vis[cur.val] = true;
                    if (cur.left !=  null && !vis[cur.left.val]) q.offer(cur.left);
                    if (cur.right != null && !vis[cur.right.val]) q.offer(cur.right);
                    if (map.containsKey(cur) && map.get(cur) != null && !vis[map.get(cur).val]) q.offer(map.get(cur));
                }
                
                
            }
        }
        return new LinkedList<>();
    }
}
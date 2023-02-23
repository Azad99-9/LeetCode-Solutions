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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        // T - O( N )
        // S - O( N )
        List<List<Integer>> ans = new LinkedList<>();
        if(root == null) return ans;
        Queue<TreeNode> auxilary = new LinkedList<>();
        int level = 0;
        auxilary.offer(root);
        while(!auxilary.isEmpty()) {
            int size = auxilary.size();
            List<Integer> subList = new LinkedList<>();
            for(int i = 0; i < size; i++) {
                TreeNode cur = auxilary.poll();
                subList.add(cur.val);
                if(cur.left != null)
                    auxilary.offer(cur.left);
                if(cur.right != null)
                    auxilary.offer(cur.right);
            }
            if(level % 2 == 0)
                ans.add(subList);
            else {
                Collections.reverse(subList);
                ans.add(subList);
            }
            level++;
        }
        return ans;
    }
}

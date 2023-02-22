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
    class Pair {
        TreeNode node;
        int num;
        Pair(TreeNode _node, int _num) {
            num = _num;
            node = _node;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {
    	// T - O( N )
    	// S - O( N )
        if(root == null) return 0;
        int ans = 0;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));
        while(!q.isEmpty()) {
            int size = q.size();
            int mmin = q.peek().num; // To make the id start from 0
            int first = 0, last = 0;
            for(int i=0; i<size; i++) {
                int cur_id = q.peek().num - mmin;
                TreeNode node = q.peek().node;
                q.poll();
                if(i == 0) first = cur_id;
                if(i == size - 1) last = cur_id;
                if(node.left != null)
                    q.offer(new Pair(node.left, cur_id * 2 + 1));
                if(node.right != null)
                    q.offer(new Pair(node.right, cur_id * 2 + 2));
            }
            ans = Math.max(ans, last - first + 1);
        }
        return ans;
    }
}

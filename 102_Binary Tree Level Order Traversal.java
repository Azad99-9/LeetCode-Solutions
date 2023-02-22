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
    //T - O( N )
    //S - O( N )
    public List<List<Integer>> levelOrder(TreeNode root) {
     Queue<TreeNode> auxilary = new LinkedList<>();
     List<List<Integer>> ans = new LinkedList<>();
     if(root == null) return ans;
     auxilary.offer(root);
     while(!auxilary.isEmpty()) {
         int levelNum = auxilary.size();
         List<Integer> subList = new LinkedList<Integer>();
         for(int i = 0; i < levelNum; i++) {
             if(auxilary.peek().left != null) auxilary.offer(auxilary.peek().left);
             if(auxilary.peek().right != null) auxilary.offer(auxilary.peek().right);
             subList.add(auxilary.poll().val);
         }
         ans.add(subList);
     }
     return ans;
    }
}

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
    private void inorder(TreeNode r, List<Integer> asc) {
        if (r == null) return;

        inorder(r.left, asc);
        asc.add(r.val);
        inorder(r.right, asc);
    }

    private List<Integer> merge(List<Integer> l1, List<Integer> l2) {
        int i = 0, j = 0, n1 = l1.size(), n2 = l2.size();
        List<Integer> ans = new ArrayList<>();

        while(i < n1 && j < n2) {
            if (l1.get(i) < l2.get(j)) {
                ans.add(l1.get(i));
                i++;
            } else {
                ans.add(l2.get(j));
                j++;
            }
        }
        while (i < n1) ans.add(l1.get(i++));
        while (j < n2) ans.add(l2.get(j++));

        return ans;
    }

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        inorder(root1, l1);
        inorder(root2, l2);

        return merge(l1, l2);
        
    }
}

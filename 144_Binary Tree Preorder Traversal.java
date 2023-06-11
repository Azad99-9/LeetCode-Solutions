
class Solution {
        // T -O( N )
        // s -O( 1 )
        public List<Integer> preorderTraversal(TreeNode root) {
            ArrayList<Integer> preorder = new ArrayList<>();
        TreeNode current = root;
        while(current != null) {
            if(current.left == null) {
                preorder.add(current.val);
                current = current.right;
            } else {
                TreeNode prev = current.left;
                while(prev.right != null && prev.right != current) {
                    prev = prev.right;
                }

                if(prev.right == null) {
                    prev.right = current;
                    preorder.add(current.val);
                    current = current.left;
                } else {
                    prev.right = null;
                    current = current.right;
                }
            }
        }
        return preorder;
        }
    
}

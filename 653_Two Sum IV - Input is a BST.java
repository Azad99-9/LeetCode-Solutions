
public class BSTIterator {
    private Stack<TreeNode> stack = new Stack<TreeNode>();
    boolean reverse = true;
    // S - O( H )

    public BSTIterator(TreeNode root, boolean isReverse) {
        reverse = isReverse;
        pushAll(root);
    }
    
    public int next() {
        // T - O( 1 )
        TreeNode tmpNode = stack.pop();
        if(!reverse) pushAll(tmpNode.right);
        else pushAll(tmpNode.left);
        return tmpNode.val;
    }
    
    public boolean hasNext() {
        // T - O( 1 )
        return !stack.isEmpty();
    }

    private void pushAll(TreeNode node) {
        // T - O( H )
        while(node != null) {
            stack.push(node);
            if(reverse)
                node = node.right;
            else
                node = node.left;
        }
    }
}


class Solution {
    HashSet<Integer> tracker = new HashSet();
    public boolean findTarget(TreeNode root, int k) {
        if(root == null) return false;
        BSTIterator l = new BSTIterator(root, false);
        BSTIterator r = new BSTIterator(root, true); 

        int i = l.next();
        int j = r.next();
        while(i < j) {
            if(i + j == k) return true;
            else if(i + j < k) i = l.next();
            else j = r.next();
        }

        return false;
    }
}

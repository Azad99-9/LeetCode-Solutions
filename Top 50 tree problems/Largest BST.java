class Tuple {
    int maxi;
    int mini;
    int size;
    Tuple (int maxi, int mini, int size) {
        this.maxi = maxi;
        this.mini = mini;
        this.size = size;
    }
}

class Solution{
    
    // Return the size of the largest sub-tree which is also a BST
    private static Tuple recur(Node node) {
        if (node == null) return new Tuple(Integer.MIN_VALUE,
        Integer.MAX_VALUE,
        0);
        
        Tuple left = recur(node.left);
        Tuple right = recur(node.right);
        
        if (left.maxi < node.data && right.mini > node.data) {
            return new Tuple(
                Math.max(right.maxi, node.data),
                Math.min(left.mini, node.data),
                left.size + right.size + 1
                );
        } else {
            return new Tuple(
                Integer.MAX_VALUE,
                Integer.MIN_VALUE,
                Math.max(left.size, right.size)
                );
        }
    }
    
    static int largestBst(Node node)
    {
        return recur(node).size;
    }
    
}

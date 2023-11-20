class Node {
    int data;
    Node left;
    Node right;
    Node (int d) {
        data = d;
        left = right = null;
    }
}

class Solution
{
    private int pI = 0;
    private Node formBst(int[] nums, int l, int r) {
        if (l > r) return null;
        
        int mid = (l + r) / 2;
        
        Node cur = new Node(nums[mid]);
        cur.left = formBst(nums, l, mid - 1);
        cur.right = formBst(nums, mid + 1, r);
        
        return cur;
    }
    
    private void porder(int[] ans, Node root) {
        if (root == null) return;
        
        ans[pI++] = root.data;
        porder(ans, root.left);
        porder(ans, root.right);
    }
    
    public int[] sortedArrayToBST(int[] nums)
    {
        int[] ans = new int[nums.length];
        porder(ans, formBst(nums, 0, nums.length - 1));
        return ans;
    }
}

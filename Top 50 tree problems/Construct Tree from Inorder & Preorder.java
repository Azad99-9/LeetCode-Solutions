class Solution
{
    
    private static int find(int[] ino, int el, int l, int r) {
        for (int i = l; i <= r; i++) {
            if (ino[i] == el) return i;
        }
        return -1;
    }
    
    private static Node build(int l, int r, int[] in, int[] pre, int n, int[] pI) {
        if (r < l) return null;
        
        Node cur = new Node(pre[pI[0]++]);
        
        if (l == r) return cur;
        
        int ino_index = find(in, cur.data, l, r);
        
        cur.left = build(l, ino_index - 1, in, pre, n, pI);
        cur.right = build(ino_index + 1, r, in, pre, n, pI);
        
        return cur;
    }
    public static Node buildTree(int inorder[], int preorder[], int n)
    {
        return build(0, n - 1, inorder, preorder, n, new int[]{0});
    }
}

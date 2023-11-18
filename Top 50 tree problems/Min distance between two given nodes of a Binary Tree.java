class GfG {
    Node lca(Node root, int a, int b) {
        if (root == null) return null;
        
        if (root.data == a || root.data == b) return root;
        
        Node le = lca(root.left, a, b);
        Node ri = lca(root.right, a, b);
        
        if (le == null) return ri;
        if (ri == null) return le;
        
        return root;
    }
    
    int find(Node root, int a) {
        if (root == null) return -1;
        
        if (root.data == a) return 0;
        
        int l = find(root.left, a);
        int r = find(root.right, a);
        
        if (l == -1 && r == -1) return -1;
        else if (l == -1) return r + 1;
        else return l + 1;
    }
    
    int findDist(Node root, int a, int b) {
        Node lc = lca(root, a, b);
        
        int h1 = find(lc, a);
        int h2 = find(lc, b);
        return h1 + h2;
    }
}

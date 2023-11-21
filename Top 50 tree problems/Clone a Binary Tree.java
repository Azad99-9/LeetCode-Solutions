class Solution{
    private void mkMp(Tree root, Map<Tree, Tree> mp) {
        if (root == null) return;
        
        mp.put(root, new Tree(root.data));
        
        mkMp(root.left, mp);
        mkMp(root.right, mp);
    }
    
    private void mkTree(Tree root, Map<Tree, Tree> mp) {
        if (root == null) return;
        
        Tree cur = mp.get(root);
        cur.left = mp.get(root.left);
        cur.right = mp.get(root.right);
        cur.random = mp.get(root.random);
        
        mkTree(root.left, mp);
        mkTree(root.right, mp);
    }
    
    public Tree cloneTree(Tree tree){
       Map<Tree, Tree> mp = new HashMap<>();
       
       mkMp(tree, mp);
       mkTree(tree, mp);
       
       return mp.get(tree);
     }
}

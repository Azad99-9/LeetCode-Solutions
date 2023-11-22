class Solution
{
    // root : the root Node of the given BST
    // target : the target sum
    private int check(Node root, Set<Integer> s, int t) {
        if (root == null) return 0;
        
        if (s.contains(t - root.data)) return 1;
        s.add(root.data);
        
        int l = check(root.left, s, t);
        if (l == 1) return 1;
        
        int r = check(root.right, s, t);
        if (r == 1) return 1;
        
        return 0;
    }
    
    public int isPairPresent(Node root, int target)
    {
        
        Set<Integer> s = new HashSet<>();    
        return check(root, s, target);
    }
}


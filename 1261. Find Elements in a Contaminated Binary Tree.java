class FindElements {

    private TreeNode root;
    private Set<Integer> nodes;
    public FindElements(TreeNode root) {
        this.root = root;
        nodes = new HashSet<>();
        decontaminate(root, 0);
    }

    private void decontaminate(TreeNode root, int val) {
        if (root == null) return;

        root.val = val;
        nodes.add(val);

        decontaminate(root.left, 2*val + 1);
        decontaminate(root.right, 2*val + 2);
    }
    
    public boolean find(int target) {
        return nodes.contains(target);
    }
}


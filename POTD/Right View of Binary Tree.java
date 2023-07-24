class Solution{
    void preOrder(Node node, Set<Integer> help, ArrayList<Integer> ans, int curLevel) {
        if (node == null) return;
        if (!help.contains(curLevel)) {
            help.add(curLevel);
            ans.add(node.data);
        }
        preOrder(node.right, help, ans, curLevel + 1);
        preOrder(node.left, help, ans, curLevel + 1);
    }
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node node) {
        ArrayList<Integer> ans = new ArrayList<>();
        preOrder(node, new HashSet<>(), ans, 1);
        return ans;
    }
}
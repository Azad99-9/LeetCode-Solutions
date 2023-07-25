class Solution
{
    private int recursion(Node node, ArrayList<Integer> parents, int k, int target) {
        if (node == null) return -1;
        
        if (node.data == target) {
            int ind = parents.size() - k;
            if (ind < 0) return -1;
            return parents.get(ind);
        }
        
        parents.add(node.data);
        
        int left = recursion(node.left, parents, k, target);
        if (left > 0) return left;
        int right = recursion(node.right, parents, k, target);
        if (right > 0) return right;
        
        parents.remove(parents.size() - 1);
        return -1;
    }
    public int kthAncestor(Node root, int k, int node)
    {
        return recursion(root, new ArrayList<>(), k, node);
    }
}
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    Map<Node, Node> oldToNew = new HashMap<>();

    public Node clone(Node node) {
        // T - O( N ) where N = |V| + |E|
        if(oldToNew.containsKey(node)) return oldToNew.get(node);

        Node copy = new Node(node.val);
        oldToNew.put(node, copy);
        for(Node nei : node.neighbors)
            copy.neighbors.add(clone(nei));
        return copy;
    }

    public Node cloneGraph(Node node) {
        return node != null ? clone(node) : null;
    }
}

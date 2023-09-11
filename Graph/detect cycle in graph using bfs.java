class Pair {
    int node, parent;
    Pair(int node, int parent) {
        this.node = node;
        this.parent = parent;
    }
}

class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean bfs (int src, boolean[] vis, ArrayList<ArrayList<Integer>> adj) {
        Queue<Pair> helper = new LinkedList<>();
        helper.offer(new Pair(src, -1));
        vis[src] = true;
        
        while (!helper.isEmpty()) {
            Pair cur = helper.poll();
            int parent = cur.parent;
            int curNode = cur.node;
            
            for (int adjNode: adj.get(curNode)) {
                if (!vis[adjNode]) {
                    vis[adjNode] = true;
                    helper.offer(new Pair(adjNode, curNode));
                }
                else if (adjNode != parent) return true;
            }
        }
        
        return false;
    }
    
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];
        
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if (bfs(i, vis, adj)) return true;
            }
        }
        
        return false;
    }
}
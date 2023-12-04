class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean dfs(int n, boolean[] vis, int p, ArrayList<ArrayList<Integer>> adj) {
        vis[n] = true;
        for (int a: adj.get(n)) {
            if (vis[a]) {
                if (a != p) return true;
                else continue;
            }
            else {
                if (dfs(a, vis, n, adj)) return true;
            }
        }
        return false;
    }
    
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if (dfs(i, vis, -1, adj)) return true;
            }
        }
        return false;
    }
}

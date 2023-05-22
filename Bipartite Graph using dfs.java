class Solution
{
    public boolean dfs(int node, ArrayList<ArrayList<Integer>>adj, boolean vis[], int[] colors, int color) {
        vis[node] = true;
        colors[node] = color;
        
        for (int adjNode: adj.get(node)) {
            if (!vis[adjNode]) {
                boolean isBipartite = dfs(adjNode, adj, vis, colors, color == 1 ? 2 : 1);
                if (!isBipartite) return false;
            } else if (colors[adjNode] == color) {
                return false;
            }
        }
        
        return true;
    }
    
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        int[] colors = new int[V];
        boolean[] vis = new boolean[V];
        
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                boolean isBipartite = dfs(i, adj, vis, colors, 1);
                if (!isBipartite) return false;
            }
        }
        
        return true;
    }
}
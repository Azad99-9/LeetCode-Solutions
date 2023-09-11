class Solution {
    // Function to detect cycle in an undirected graph. // using dfs // T - O( v + e )
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
     int[] vis = new int[V];
     for( int i = 0; i < V; i++) {
         if(vis[i] == 0)
            if(dfs(i, -1, vis, adj) == true) return true;
     }
     return false;
    }
    
    public boolean dfs(int node, int parent, int vis[], ArrayList<ArrayList<Integer>> adj) {
        vis[node] = 1;
        for(int adjNode : adj.get(node)) {
            if(vis[adjNode] == 0) {
                if(dfs(adjNode, node, vis, adj) == true) return true;
            }
            else if(adjNode != parent) return true;
        }
        return false;
    }
}

class Solution
{
    //Function to find if the given edge is a bridge in graph.
    static void dfs (int n, ArrayList<ArrayList<Integer>> adj, boolean[] vis) {
        if (vis[n]) return;
    
        vis[n] = true;
        
        for (int a : adj.get(n)) {
            dfs (a, adj, vis);
        }
        
        return;
    }
    static int isBridge(int V, ArrayList<ArrayList<Integer>> adj,int c,int d)
    {
        boolean[] vis = new boolean[V];
        
        
        adj.get(c).remove(Integer.valueOf(d));
        adj.get(d).remove(Integer.valueOf(c));
        
        dfs(c, adj, vis);
        
        if (vis[d]) return 0;
        
        return 1;
    }
}

class Solution
{
    public boolean bfs(int V, ArrayList<ArrayList<Integer>>adj, int src, boolean[] vis, int[] colors) {
        
        Queue<Integer> helper = new LinkedList<>();
        
        helper.offer(src);
        vis[src] = true;
        colors[src] = 1;
        
        while (!helper.isEmpty()) {
            int cur = helper.poll();
            
            for (int adjNode : adj.get(cur)) {
                if (!vis[adjNode]) {
                    if (colors[cur] == 1)
                        colors[adjNode] = 2;
                    else colors[adjNode] = 1;
                    vis[adjNode] = true;
                    helper.offer(adjNode);
                } else if (colors[adjNode] == colors[cur]) return false;
            }
        }
        
        return true;
        
    }
    
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        boolean[] vis = new boolean[V];
        int[] colors = new int[V];
        
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if ((!bfs(V, adj, i, vis, colors))) return false;
            }
        }
        
        return true;
    }
}
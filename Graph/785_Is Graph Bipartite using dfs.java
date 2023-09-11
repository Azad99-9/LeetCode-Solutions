class Solution {
    public boolean isBipartite(int[][] adj)
    {
        int V = adj.length;
        int color[] = new int[V];
	    for(int i = 0;i<V;i++) color[i] = -1; 
	    
	    // for connected components
	    for(int i = 0;i<V;i++) {
	        if(color[i] == -1) {
	            if(dfs(i, 0, color, adj) == false) return false; 
	        }
	    }
	    return true; 
    }

     private boolean dfs(int node, int col, int color[], 
    int[][] adj) {
        
        color[node] = col; 
        
        // traverse adjacent nodes
        for(int it : adj[node]) {
            // if uncoloured
            if(color[it] == -1) {
                if(dfs(it, 1 - col, color, adj) == false) return false; 
            }
            // if previously coloured and have the same colour
            else if(color[it] == col) {
                return false; 
            }
        }
        
        return true; 
    }
}

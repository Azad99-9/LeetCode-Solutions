public boolean dfs (ArrayList<ArrayList<Integer>> adj, int node, boolean visited[], int parent) {
        
        visited[node] = true;
        for (int adjNode : adj.get(node)) {
            if (!visited[adjNode]) 
                if (dfs(adj, adjNode, visited, node)) return true;
            else if (adjNode != parent) return true;
        }
        
        return false;
    }
    
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                boolean hasCycle = dfs(adj, i, visited, -1);
                if (hasCycle) return true;
            }
        }
        
        return false;
    }
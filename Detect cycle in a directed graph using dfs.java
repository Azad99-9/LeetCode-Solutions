class Solution {
    // Function to detect cycle in a directed graph.
    public void createAdjList(int V, ArrayList<ArrayList<Integer>> adj, ArrayList<ArrayList<Integer>> adjList) {
        for (int i = 0; i < adj.size(); i++) {
            int u = adj.get(i).get(0);
            int v = adj.get(i).get(1);
            adjList.get(u).add(v);
        }
        
    }
    
    public boolean dfs(int src, int parent, ArrayList<ArrayList<Integer>> adjList, boolean[] vis, Set<Integer> prevNodes) {
        vis[src] = true;
        prevNodes.add(src);
        
        for (int adjNode: adjList.get(src)) {
            if (!vis[adjNode]) {
                boolean hasCycle = dfs(adjNode, src, adjList, vis, prevNodes);
                if (hasCycle) return true;
            } else if (prevNodes.contains(adjNode)) return true;
        }
        
        prevNodes.remove(src);
        return false;
    }
    
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        
        // ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        // for (int i = 0; i < V; i++) adjList.add(new ArrayList<>());
        boolean[] vis = new boolean[V];
        
        // createAdjList(V, adj, adjList);
        
        for (int i = 0; i < V; i++) {
            if (!vis[i]) { 
                Set<Integer> prevNodes = new HashSet<>();
                boolean hasCycle = dfs(i, -1, adj, vis, prevNodes);
                if (hasCycle) return true;
            }
        }
        
        return false;
    }
}
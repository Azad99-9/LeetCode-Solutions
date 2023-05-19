//User function Template for Java

class Solution {
    static void dfs(ArrayList<ArrayList<Integer>> adj, boolean vis[], int node) {
        if (vis[node]) return;
        
        vis[node] = true;
        for (int adjNode: adj.get(node)) {
            dfs(adj, vis, adjNode);
        }
    }
    
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        boolean vis[] = new boolean[V+1];
        int noofProvinces = 0;
        
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < V; i++) adjList.add(new ArrayList<>());
        
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (adj.get(i).get(j) == 1) {
                    adjList.get(i).add(j);
                    
                }
            }
        }
        
        for(int node = 0; node < V; node++) {
            if (!vis[node]) {
                dfs(adjList, vis, node);
                noofProvinces += 1;
            }
        }
        
        return noofProvinces;
    }
};
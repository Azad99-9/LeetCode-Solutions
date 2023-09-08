class Solution {
    public int findMotherVertex(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        int lastVisited = 0; // Initialize the last visited vertex to 0 (or any vertex)

        // Perform DFS from all vertices to mark visited vertices and track the last visited vertex.
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(adj, i, visited);
                lastVisited = i;
            }
        }

        // Reset visited array for a new DFS from the lastVisited vertex.
        for (int i = 0; i < V; i++) {
            visited[i] = false;
        }

        // Perform DFS from the lastVisited vertex to check if it's a mother vertex.
        dfs(adj, lastVisited, visited);

        // If the lastVisited vertex is a mother vertex, then all vertices should be visited.
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                return -1; // No mother vertex found
            }
        }

        return lastVisited; // The lastVisited vertex is a mother vertex
    }

    private void dfs(ArrayList<ArrayList<Integer>> adj, int v, boolean[] visited) {
        visited[v] = true;
        for (int neighbor : adj.get(v)) {
            if (!visited[neighbor]) {
                dfs(adj, neighbor, visited);
            }
        }
    }
}
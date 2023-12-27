class Solution {
    public void dfs(ArrayList<ArrayList<Integer>> adj, int s, int d, boolean[] visited, int[] count) {
        if (s == d) {
            count[0]++;
            return;
        }

        visited[s] = true;
        for (int k : adj.get(s)) {
            if (!visited[k]) {
                dfs(adj, k, d, visited, count);
            }
        }
        visited[s] = false;
    }

    public int countPaths(int V, ArrayList<ArrayList<Integer>> adj, int source, int destination) {
        boolean[] visited = new boolean[V];
        int[] count = new int[1];

        dfs(adj, source, destination, visited, count);
        return count[0];
    }
}

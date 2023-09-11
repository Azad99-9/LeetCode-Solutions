class Solution {
    long ans = 0;
    public long dfs (int node, ArrayList<ArrayList<Integer>> adj, boolean[] vis, int n, int seats) {
        vis[node] = true;

        int noofNodes = 1;
        for (int adjNode: adj.get(node)) {
            if (!vis[adjNode]) {
                noofNodes += dfs(adjNode, adj, vis, n, seats);
            }
        }

        int x = noofNodes/seats;
        if (noofNodes%seats != 0) x++;

        if (node != 0) ans += x;

        return noofNodes;
    }

    ArrayList<ArrayList<Integer>> adjList (int[][] roads, int n) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());

        for (int[] road: roads) {
            int u = road[0];
            int v = road[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        return adj;
    }

    public long minimumFuelCost(int[][] roads, int seats) {
        int n = roads.length + 1;
        ArrayList<ArrayList<Integer>> adjList = adjList(roads, n);
        boolean vis [] = new boolean[n];
        dfs(0, adjList, vis, n, seats);
        return ans;
    }
}
class Solution {
    public ArrayList<ArrayList<Integer>> formGraph (int n, List<List<Integer>> connections) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());

        for (int i = 0; i < connections.size(); i++) {
            int u = connections.get(i).get(0);
            int v = connections.get(i).get(1);
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        return adj;
    }

    public void dfs (int node, ArrayList<ArrayList<Integer>> adj, int n, boolean[] vis, int[] insertionTime, int[] lowInsertionTime, int time, int parent, List<List<Integer>> bridges) {
        vis[node] = true;
        insertionTime[node] = time;
        lowInsertionTime[node] = time;

        for (int adjNode: adj.get(node)) {
            if (adjNode == parent) continue;
            if (!vis[adjNode]) {
                dfs(adjNode, adj, n, vis, insertionTime, lowInsertionTime, time+1, node, bridges);
                lowInsertionTime[node] = Math.min(lowInsertionTime[adjNode],lowInsertionTime[node]);
                if (lowInsertionTime[adjNode] > insertionTime[node]) bridges.add(Arrays.asList(adjNode, node));
            } else {
                lowInsertionTime[node] = Math.min(lowInsertionTime[adjNode],lowInsertionTime[node]);
            }
        }
    }

    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        ArrayList<ArrayList<Integer>> adj = formGraph(n, connections);
        List<List<Integer>> bridges = new ArrayList<>();
        int[] lowInsertionTime = new int[n];
        int[] insertionTime = new int[n];
        boolean vis[] = new boolean[n];
        dfs(0, adj, n, vis, insertionTime, lowInsertionTime, 1, -1, bridges);
        return bridges;
    }
}
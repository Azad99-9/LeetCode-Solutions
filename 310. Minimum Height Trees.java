class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (n == 1) {
            List<Integer> x = new ArrayList<>();
            x.add(0);
            return x;
        }

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i < n; i++) adjList.add(new ArrayList<>());
        int[] degree = new int[n];
        int nodes = n;
        List<Integer> ans = new ArrayList<>();

        for (int[] edge: edges) {
            int u = edge[0];
            int v = edge[1];

            degree[u]++;
            degree[v]++;
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        boolean[] vis = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (degree[i] == 1) {
                q.offer(i);
                vis[i] = true;
            }
        }

        while (!q.isEmpty()) {
            int size = q.size();

            ans = new ArrayList<>(q);
            for (int i = 0; i < size; i++) {
                int cur = q.poll();

                for (int adj: adjList.get(cur)) {
                    if (!vis[adj]) {
                        degree[adj]--;
                        if (degree[adj] == 1) {
                            q.offer(adj);
                            vis[adj] = true;
                        }
                    }
                }
            }
        }
        return ans;
    }
}
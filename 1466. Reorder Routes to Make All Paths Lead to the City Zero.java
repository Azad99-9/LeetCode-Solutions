class Pair {
    int node;
    int direction;
    Pair (int n, int d) {
        node = n;
        direction = d;
    }
}

class Solution {
    private ArrayList<ArrayList<Pair>> adj (int[][] connections, int n) {
        ArrayList<ArrayList<Pair>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) adjList.add(new ArrayList<>());

        for (int[] connection : connections) {
            int u = connection[0];
            int v = connection[1];

            adjList.get(u).add(new Pair(v, 1));
            adjList.get(v).add(new Pair(u, -1));
        }

        return adjList;
    }
    public int minReorder(int n, int[][] connections) {
        ArrayList<ArrayList<Pair>> adjList = adj(connections, n);
        Queue<Integer> q = new LinkedList<>();
        q.offer(0);
        int ans = 0;
        boolean[] vis = new boolean[n];
        vis[0] = true;

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int curNode = q.poll();
                for (Pair adjNode: adjList.get(curNode)) {
                    int adj = adjNode.node;
                    int direction = adjNode.direction;

                    if (!vis[adj]) {
                        q.offer(adj);
                        vis[adj] = true;
                        if (direction == 1) ans++;
                    }

                }
            }

        }
        return ans;
    }
}
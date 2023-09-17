class Pair {
    int v;
    int wt;
    Pair (int _v, int _w) {
        v = _v;
        wt = _w;
    }
}

class Solution {
    private ArrayList<ArrayList<Pair>> makeGraph (int[][] times, int n) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] time: times) {
            int u = time[0] - 1;
            int v = time[1] - 1;
            int wt = time[2];

            adj.get(u).add(new Pair(v, wt));
        }

        return adj;
    }

    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<Pair>> adj = makeGraph(times, n);
        int[] dist = new int[n];
        k = k-1;

        for (int i = 0; i < n; i++) dist[i] = Integer.MAX_VALUE;
        dist[k] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.wt - b.wt);

        pq.offer(new Pair(k, 0));

        while (!pq.isEmpty()) {
            Pair cur = pq.poll();
            int curNode = cur.v;
            int curWt = cur.wt;

            for (Pair i : adj.get(curNode)) {
                int adjNode = i.v;
                int adjWt = i.wt;

                if (dist[curNode] + adjWt < dist[adjNode]) {
                    dist[adjNode] = dist[curNode] + adjWt;
                    pq.offer(new Pair(adjNode, dist[adjNode]));
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) ans = Math.max(dist[i], ans);

        return ans != Integer.MAX_VALUE ? ans : -1;
    }
}
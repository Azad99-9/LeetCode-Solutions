class Pair {
    int dist, node; 
    Pair (int dist, int node) {
        this.dist = dist;
        this.node = node;
    }
}

class Solution {
    public static List<Integer> shortestPath(int n, int m, int edges[][]) {
        int[] dist = new int[n+1];
        int[] parent = new int[n+1];
        for (int i = 0; i <= n; i++) {
            dist[i] = Integer.MAX_VALUE;
            parent[i] = i;
        };
        
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }
        
        for (int[] edge: edges) {
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];
            adj.get(u).add(new Pair(wt, v));
            adj.get(v).add(new Pair(wt, u));
        }
        
        PriorityQueue<Pair> helper = new PriorityQueue<>((a, b) -> a.dist - b.dist);
        
        dist[1] = 0;
        parent[1] = 1;
        helper.offer(new Pair(0, 1));
        
        while (!helper.isEmpty()) {
            Pair minPair = helper.poll();
            
            for (Pair adjPair: adj.get(minPair.node)) {
                int adjNode = adjPair.node;
                int adjdist = adjPair.dist;
                if (minPair.dist + adjdist < dist[adjNode]) {
                    dist[adjNode] = minPair.dist + adjdist;
                    parent[adjNode] = minPair.node;
                    helper.offer(new Pair(dist[adjNode], adjNode));
                }
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        int i = n;
        while (i != 1) {
            if (parent[i] == i) {
                ArrayList<Integer> tmp = new ArrayList<>();
                tmp.add(-1);
                return tmp;
            } else {
                ans.add(0, i);
            }
            i = parent[i];
        }
        
        ans.add(0,1);
        return ans;
    }
}
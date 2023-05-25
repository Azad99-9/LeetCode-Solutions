class Solution {
    
    public int[] shortestPath(int[][] edges,int n,int m ,int src) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        int[] distance = new int[n];
        boolean[] vis = new boolean[n];
        Queue<Integer> helper = new LinkedList<>();
        
        helper.offer(src);
        distance[src] = 0;
        vis[src] = true;
        
        while (!helper.isEmpty()) {
            int cur = helper.poll();
            
            for (int adjNode: adj.get(cur)) {
                if (!vis[adjNode]) {
                    vis[adjNode] = true;
                    distance[adjNode] = distance[cur] + 1;
                    helper.offer(adjNode);
                }
            }
        }
        
        for (int i = 0;  i < n; i++) {
            if (!vis[i]) distance[i] = -1;
        }
        
        return distance;
    }
}
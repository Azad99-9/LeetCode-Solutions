class Solution {
    // T - O( v + e )
    // s - O( v )
    private boolean checkCycle(int node, Map<Integer, List<Integer>> adj, int vis[], int dfsvis[]) {
        vis[node] = 1;
        dfsvis[node] = 1;

        if(adj.containsKey(node))
            for(Integer item : adj.get(node)) {
            if(vis[item] == 0) {
                if(checkCycle(item, adj, vis, dfsvis)) return true;
            } else if(dfsvis[item] == 1) return true;
        }

        dfsvis[node] = 0;
        return false;
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> adj_list = new HashMap<>();
        for(int[] edge : prerequisites) {
            adj_list.computeIfAbsent(edge[0], k -> new ArrayList<>()).add(edge[1]);
        }
        
        int vis[] = new int[numCourses];
        int dfsvis[] = new int[numCourses];

        for(int i = 0; i < numCourses; i++) {
            if(vis[i] == 0)
                if(checkCycle(i, adj_list, vis, dfsvis)) return false;
        }

        return true;
    }
}

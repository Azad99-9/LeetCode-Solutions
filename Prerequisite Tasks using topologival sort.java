class Solution {
    public boolean isPossible(int V, int[][] prerequisites)
    {
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());
        
        for (int[] task: prerequisites) {
            int v = task[0];
            int u = task[1];
            adj.get(u).add(v);
        }
        
        int[] indegree = new int[V];
        
        for (ArrayList<Integer> curList: adj) {
            for (int node: curList) {
                indegree[node]+= 1;
            }
        }
        
        Queue<Integer> helper = new LinkedList<>();
        for (int node = 0; node < V; node++) {
            if (indegree[node] == 0) {
                helper.offer(node);
            }
        }
        
        int[] ans = new int[V];
        int i = 0;
        
        while (!helper.isEmpty()) {
            int cur = helper.poll();
            ans[i++] = cur;
            
            for (int adjNode: adj.get(cur)) {
                indegree[adjNode] -= 1;
                if ( indegree[adjNode] == 0) {
                    helper.offer(adjNode);
                }
            }
        }
        
        if (i == V) return true;
        
        return false;
    }
    
}
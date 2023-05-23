class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        int[] indegree = new int[V];
        boolean[] vis = new boolean[V];
        
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
        
        return ans;
    }
}

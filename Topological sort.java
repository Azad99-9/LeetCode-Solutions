class Solution
{
    //Function to return list containing vertices in Topological order. 
    static void dfs (int node, ArrayList<ArrayList<Integer>> adj, boolean[] vis, Stack<Integer> linearOrder) {
        vis[node] = true;
        for (int adjNode: adj.get(node)) {
            if (!vis[adjNode]) {
                dfs(adjNode, adj, vis, linearOrder);
            }
        }
        
        linearOrder.push(node);
    }
    
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        Stack<Integer> linearOrder = new Stack<>();
        boolean[] vis = new boolean[V];
        
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(i, adj, vis, linearOrder);
            }
        }
        
        int[] ans = new int[V];
        for (int i = 0; !linearOrder.isEmpty(); i++) ans[i] = linearOrder.pop();
        
        return ans;
    }
}

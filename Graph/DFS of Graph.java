class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public void dfsUtil(int i, ArrayList<Integer> ans, boolean vis[], 
    ArrayList<ArrayList<Integer>> adj) {
        vis[i] = true;
        ans.add(i);
        for (int adjNode: adj.get(i)) {
            if(!vis[adjNode]) {
                dfsUtil(adjNode, ans, vis, adj);
            }
        }
        
        
    }
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans=  new ArrayList<>();
        boolean vis[] = new boolean[V];
        // for (int i = 0; i < V; i++) System.out.println(adj.get(i));
   
        dfsUtil(0, ans, vis, adj);
        return ans;
    }
}
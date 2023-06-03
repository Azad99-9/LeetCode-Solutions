class Solution
{
    //Function to find number of strongly connected components in the graph.
    public void dfs (ArrayList<ArrayList<Integer>> adj, boolean[] vis, Stack<Integer> stk, int node) {
        vis[node] = true;
        
        for (int adjNode: adj.get(node)) {
            if (!vis[adjNode]) dfs(adj, vis, stk, adjNode);
        }
        
        stk.push(node);
    }
    
    public void sortByFinishTime(ArrayList<ArrayList<Integer>> adj, Stack<Integer> stk) {
        boolean vis[] = new boolean[adj.size()];
        for (int i = 0; i < adj.size(); i++) {
            if (!vis[i]) dfs(adj, vis, stk, i);
        }
    }
    
    public ArrayList<ArrayList<Integer>> transpose(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<ArrayList<Integer>> newAdj = new ArrayList<>();
        for (int i = 0; i < adj.size(); i++) newAdj.add(new ArrayList<>());
        
        for (int node = 0; node < adj.size(); node++) {
            for (int adjNode: adj.get(node)) newAdj.get(adjNode).add(node);
        }
        
        return newAdj;
    }
    
    public void dfsNormal (ArrayList<ArrayList<Integer>> adj, boolean[] vis, int node) {
        vis[node] = true;
        
        for (int adjNode: adj.get(node)) {
            if (!vis[adjNode]) dfsNormal(adj, vis, adjNode);
        }
        
    }
    
    public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj)
    {
        Stack<Integer> stk = new Stack<>();
        sortByFinishTime(adj, stk);
        ArrayList<ArrayList<Integer>> transposeAdj = transpose(adj);
        boolean[] vis = new boolean[adj.size()];
        int connectedComps = 0;
        while (!stk.isEmpty()) {
            int curNode = stk.pop();
            if(!vis[curNode]) {
                connectedComps++;
                dfsNormal(transposeAdj, vis, curNode);
            }
        }
        return connectedComps;
        
        
    }
}
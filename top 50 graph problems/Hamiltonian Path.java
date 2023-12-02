class Solution 
{ 
    private boolean dfs(int n, Set<Integer> vis, ArrayList<ArrayList<Integer>> graph) {
        if (vis.contains(n)) return false;
        
        vis.add(n);
        
        if (vis.size() == graph.size() - 1) return true;
        
        for (int adj: graph.get(n)) {
            if (dfs(adj, vis, graph)) return true;
        }
        
        vis.remove(n);
        
        return false;
    }
    
    boolean check(int N, int M, ArrayList<ArrayList<Integer>> Edges) 
    { 
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        
        for (int i = 0; i <= N; i++) graph.add(new ArrayList<>());
        Set<Integer> vis = new HashSet<>();
        

        for (ArrayList<Integer> edge: Edges) {
            graph.get(edge.get(0)).add(edge.get(1));
            graph.get(edge.get(1)).add(edge.get(0));
        }
        
        
        for (int i = 1; i <= N; i++) {
            if (dfs(i, vis, graph)) return true;
        }
        

        return false;
    }
} 

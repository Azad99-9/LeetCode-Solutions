class Solution {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        List<List<Integer>> ans = new LinkedList<>();
        
        for (int i = 0; i < V; i++) ans.add(new LinkedList<>());
        
        for (int[] edge: edges) {
            int u = edge[0];
            int v = edge[1];
            
            ans.get(u).add(v);
            ans.get(v).add(u);
        }
        
        return ans;
    }
}
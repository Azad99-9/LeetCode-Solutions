class Solution
{
    private boolean dfs(int i, int p, int[] colors, ArrayList<ArrayList<Integer>>adj) {
       if (p != -1 && colors[i] != -1) return colors[i] == colors[p];
       
       colors[i] = ((p != -1 && colors[p] == 1) ? 2 : 1);
       
       for (int a: adj.get(i)) {
           boolean isNotBipartite = dfs(a, i, colors, adj);
           if (isNotBipartite) return true;
       }
       
       return false;
       
    }
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        int colors [] = new int[V];
        
        Arrays.fill(colors, -1);
        
        for (int i = 0; i < V; i++) {
            if (colors[i] == -1) {
                boolean isNotBipartite = dfs(i, -1, colors, adj);
                if (isNotBipartite) return false;
            }
        }
        
        return true;
    }
}

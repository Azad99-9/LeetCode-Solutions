class Solution{
    static ArrayList<ArrayList<Integer>> transitiveClosure(int N, int graph[][])
    {
        int n = N;
        
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i != j) {
                        int l = graph[i][k];
                        int r = graph[k][j];
                        
                        if (l == r && l == 1) {
                            graph[i][j] = 1;
                        }
                    }
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            ans.add(new ArrayList<>());
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    ans.get(i).add(1);
                } else {
                    ans.get(i).add(graph[i][j]);
                }
            }
        }
        
        return ans;
    }
}

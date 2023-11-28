class Solution {
    int sumOfDependencies(ArrayList<ArrayList<Integer>> adj, int V) {
        int ans = 0;
        for (int i = 0; i < V; i++) {
            ans += adj.get(i).size();
        }
        
        return ans;
    }
};

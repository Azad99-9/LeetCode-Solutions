//User function Template for Java
class Solution 
{ 
    boolean graph(int N, int adj[][]) 
    { 
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    int min = Math.min(adj[j][k], adj[j][i] + adj[i][k]);
                    if (min != adj[j][k]) return false;
                }
            }      
        }
        return true;
    }
} 
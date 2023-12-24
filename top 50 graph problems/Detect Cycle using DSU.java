class Solution
{
    class Dsu {
        int[] parent;
        Dsu(int n) {
            parent = new int[n];
            Arrays.fill(parent, -1);
        }
        
        int find(int n) {
            if (parent[n] < 0) return n;
            return parent[n] = find(parent[n]);
        }
        
        boolean union(int u, int v) {
            int upu = find(u);
            int upv = find(v);
            
            if (upu == upv) return false;
            else if (parent[upu] < parent[upv]) {
                parent[upu] += parent[upv];
                parent[upv] = upu;
            } else {
                parent[upv] += parent[upu];
                parent[upu] = upv;
            }
            
            return true;
        }
    }
    //Function to detect cycle using DSU in an undirected graph.
    public int detectCycle(int V, ArrayList<ArrayList<Integer>> adj)
    {
        Dsu ds = new Dsu(V);
        for (int u = 0; u < adj.size(); u++) {
            for (int v : adj.get(u)) {
                if (u < v) {
                    if (!ds.union(u, v)) {
                        return 1;
                    }
                }
            }
        }
        
        return 0;
    }
}

class DS {
    int[] parent;
    DS(int _v) {
        parent = new int[_v];
        for (int i = 0; i < _v; i++) parent[i] = -1;
    }
    
    public int find(int u) {
        if (parent[u] < 0) return u;
        return find(parent[u]);
    }
    
    public boolean union(int u, int v) {
        int _upu = find(u);
        int _upv = find(v);
        
        if (_upu == _upv) return false;
        else if (parent[_upu] > parent[_upv]) {
            parent[_upu] += parent[_upv];
            parent[_upv] = _upu;
        } else {
            parent[_upv] += parent[_upu];
            parent[_upu] = _upv;
        }
        
        return true;
    }
}


class Solution
{
    //Function to detect cycle using DSU in an undirected graph.
    
    
    public int detectCycle(int V, ArrayList<ArrayList<Integer>> adj)
    {
        DS ds = new DS(adj.size());
        // ArrayList<List<Integer>> edges = new ArrayList<>();
        for (int i = 0; i < adj.size(); i++) {
            // System.out.println(adj.get(i) + " " + "hi");
            for (int j = 0; j < adj.get(i).size(); j++) {
                int u = i;
                int v = adj.get(i).get(j);
                if (v > u) {
                    if (!ds.union(u, v)) return 1;
                    // edges.add(Arrays.asList(u, v));
                    // System.out.println(edges.get(edges.size() - 1));
                }
            }
        }
        
        // for (List<Integer> edge: edges) {
        //     // System.out.println(edge);
        //     int u = edge.get(0);
        //     int v = edge.get(1);
            
        //     // System.out.println(ds.union(u,v));
        // }
        
        return 0;
    }
}

class DisjointSet {
    int[] parent;
    DisjointSet(int n) {
        this.parent = new int[n];
        for (int i = 0; i < n; i++) this.parent[i] = -1;
    }
    
    int find (int node) {
        if (parent[node] < 0) return node;
        return parent[node] = find(parent[node]);
    }
    
    void union (int u, int v) {
        int upu = find(u);
        int upv = find(v);
        
        if (upu == upv) return;
        else if (parent[upu] < parent[upv]) {
            parent[upu] = parent[upu] + parent[upv];
            parent[upv] = upu;
        } else {
            parent[upv] = parent[upu] + parent[upv];
            parent[upu] = upv;
        }
    }
}

class Solution {
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        DisjointSet ds = new DisjointSet(V);
        
        for (int i = 0;  i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (adj.get(i).get(j) == 1) ds.union(i, j);
            }
        }
        
        int provinces = 0;
        for (int i = 0; i < V; i++) {
            if (ds.parent[i] < 0) provinces++;
        }
        
        return provinces;
    }
};
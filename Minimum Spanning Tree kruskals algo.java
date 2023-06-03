class DisjointSet {
    int[] parent;
    DisjointSet(int n) {
        this.parent = new int[n];
        for (int i = 0; i < n; i++) parent[i] = -1;
    }
    
    int find (int node) {
        if (parent[node] < 0) return node;
        return parent[node] = find(parent[node]);
    }
    
    void union (int u, int v) {
        int parentu = find(u);
        int parentv = find(v);
        
        if(parentu  == parentv) return;
        else if (parent[parentu] < parent[parentv]) {
            parent[parentu] = parent[parentu] + parent[parentv];
            parent[parentv] = parentu;
        } else {
            parent[parentv] = parent[parentu] + parent[parentv];
            parent[parentu] = parentv;
        }
    }   
}

class Solution{
	static int spanningTree(int V, int E, int edges[][]){
	    DisjointSet ds = new DisjointSet(V);
	    
	    int[] parent = ds.parent;
	    int sum = 0;
	    
	    Arrays.sort(edges, (a, b) -> a[2] - b[2]);
	    
	    for (int[] edge: edges) {
	        int u = edge[0];
	        int v = edge[1];
	        int wt = edge[2];
	        int upu = ds.find(u);
	        int upv = ds.find(v);
	        if (upu == upv) continue;
	        ds.union(u, v);
	        sum+= wt;
	    }
	    
	    return sum;
	   
	   
	}
}
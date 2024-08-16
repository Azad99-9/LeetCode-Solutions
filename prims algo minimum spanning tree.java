class Pair {
    int u, v, wt;
    Pair (int u, int v, int wt) {
        this.u = u;
        this.v = v;
        this.wt = wt;
    }
}

class Solution{
	//at each level greedily check for the least weight edge that connects the non-mst to mst.
	static int spanningTree(int V, int E, int edges[][]){
	    ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
	    boolean[] vis = new boolean[V];
	    int sum = 0;
	    
	    for (int i = 0; i < V; i++) adj.add(new ArrayList<>());
	    for (int[] edge: edges) {
	        int u = edge[0];
	        int v = edge[1];
	        int wt = edge[2];
	        adj.get(u).add(new int[]{v, wt});
	        adj.get(v).add(new int[]{u, wt});
	    }
	    
	    PriorityQueue<Pair> helper = new PriorityQueue<>((a,b) -> a.wt - b.wt);
	    
	    helper.offer(new Pair(-1, 0, 0));
	    
	    while(!helper.isEmpty()) {
	        Pair minPair = helper.poll();
	        if (!vis[minPair.v]) {
	            vis[minPair.v] = true;
	            sum += minPair.wt;
	            for (int[] adjEdge: adj.get(minPair.v)) {
	                if (!vis[adjEdge[0]]) {
	                    helper.offer(new Pair(minPair.v, adjEdge[0], adjEdge[1]));
	                }
	            }
	        }
	        
	    }
	    return sum;
	}
}

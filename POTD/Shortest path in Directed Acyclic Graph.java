class Pair {
    int v, wt;
    Pair (int _v, int _wt) {
        v = _v;
        wt = _wt;
    }
}

class Solution {
    private ArrayList<ArrayList<Pair>> makeAdj(int[][] edges, int m, int n) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for (int i = 0; i < m; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            int weight = edges[i][2];
            adj.get(u).add(new Pair(v, weight));
        }
        return adj;
    }
	public int[] shortestPath(int N,int M, int[][] edges) {
		ArrayList<ArrayList<Pair>> adj = makeAdj(edges, M, N);
		
		PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.wt - b.wt);
		
		pq.offer(new Pair(0, 0));
		
		int[] dist = new int[N];
		Arrays.fill(dist, (int)1e9);
		dist[0] = 0;
		
		while (!pq.isEmpty()) {
		    Pair curPair = pq.poll();
		    int curWt = curPair.wt;
		    int curNode = curPair.v;
		    
		    ArrayList<Pair> adjNodes = adj.get(curNode);
		    for (int i = 0; i < adjNodes.size(); i++) {
		        Pair adjPair = adjNodes.get(i);
		        int adjWt = adjPair.wt;
		        int adjNode = adjPair.v;
		        
		        if (adjWt + dist[curNode] < dist[adjNode]) {
		            dist[adjNode] = adjWt + dist[curNode];
		            pq.offer(new Pair(adjNode, dist[adjNode]));
		        }
		    }
		}
		for (int i = 0; i < dist.length; i++) {
		    if (dist[i] == (int)1e9) dist[i] = -1;
		}
		return dist;
	}
}
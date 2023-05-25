class Pair {
    int dist, node; 
    Pair (int dist, int node) {
        this.dist = dist;
        this.node = node;
    }
}

class Solution
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        int[] dist = new int[V];
        for (int i = 0; i < V; i++) dist[i] = Integer.MAX_VALUE;
        
        PriorityQueue<Pair> helper = new PriorityQueue<>((a, b) -> a.dist - b.dist);
        
        dist[S] = 0;
        helper.offer(new Pair(0, S));
        
        while (!helper.isEmpty()) {
            Pair minPair = helper.poll();
            
            for (ArrayList<Integer> adjPair: adj.get(minPair.node)) {
                int adjNode = adjPair.get(0);
                int adjdist = adjPair.get(1);
                if (dist[minPair.node] + adjdist < dist[adjNode]) {
                    dist[adjNode] = dist[minPair.node] + adjdist;
                    helper.offer(new Pair(dist[adjNode], adjNode));
                }
            }
        }
        
        return dist;
    }
}

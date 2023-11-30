class Solution
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        PriorityQueue<List<Integer>> pq = new PriorityQueue<>((a,b)-> a.get(1) - b.get(1));
        
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[S] = 0;
        
        pq.offer(Arrays.asList(S, 0));
        
        while (!pq.isEmpty()) {
            List<Integer> cur = pq.poll();
            int cn = cur.get(0);
            int cd = cur.get(1);
            
            for (ArrayList<Integer> aj: adj.get(cn)) {
                int nn = aj.get(0);
                int nd = aj.get(1);
                
                if (cd + nd < dist[nn]) {
                    dist[nn] = cd + nd;
                    pq.offer(Arrays.asList(nn, cd + nd));
                }
            }
        }
        
        return dist;
    }
}



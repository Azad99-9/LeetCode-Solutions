class Solution
{
    public String exercise(int N, int M, ArrayList<ArrayList<Integer>> A, int src, int dest, int X)
    {
        ArrayList<ArrayList<List<Integer>>> graph = new ArrayList<>();
        
        for (int intersection = 0; intersection < N; intersection++) {
            graph.add(new ArrayList<>());
        }
        
        // create graph
        for (ArrayList<Integer> road: A) {
            int u = road.get(0);
            int v = road.get(1);
            int len = road.get(2);
            
            graph.get(u).add(Arrays.asList(v, len));
            graph.get(v).add(Arrays.asList(u, len));
        }
        
        // dijkstra.
        int[] dist = new int[N];
        
        Arrays.fill(dist, Integer.MAX_VALUE);
        
        dist[src] = 0;
        
        PriorityQueue<List<Integer>> q = new PriorityQueue<>((a, b) -> a.get(1) - b.get(1));
        
        q.add(Arrays.asList(src, 0));
        
        while (!q.isEmpty()) {
            List<Integer> cur = q.poll();
            
            int curN = cur.get(0);
            int curL = cur.get(1);
            
            if (curN == dest) {
                if (curL <= X) return "Neeman's Cotton Classics";
                else return "Neeman's Wool Joggers";
            }
            
            
            for (List<Integer> adj : graph.get(curN)) {
                int adjN = adj.get(0);
                int adjL = adj.get(1);
                
                if (dist[adjN] > curL + adjL) {
                    dist[adjN] = curL + adjL;
                    q.offer(Arrays.asList(adjN, curL + adjL));
                }
            }
        }
        
        // decide which shoes to buy.
        int shortestDistance = dist[dest];
        if (shortestDistance <= X) {
            return "Neeman's Cotton Classics";
        }
        
        return "Neeman's Wool Joggers";
    }
}

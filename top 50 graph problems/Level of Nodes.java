class Solution
{
    //Function to find the level of node X.
    int nodeLevel(int V, ArrayList<ArrayList<Integer>> adj, int X)
    {
        Queue<List<Integer>> q = new LinkedList<>();
        boolean[] vis = new boolean[adj.size()];
        
        q.offer(Arrays.asList(0,0));
        vis[0] = true;
        
        while (!q.isEmpty()) {
            List<Integer> cur = q.poll();
            int curN = cur.get(0);
            int curL = cur.get(1);
            
            if (curN == X) return curL;
            
            for (int aNode : adj.get(curN)) {
                if (!vis[aNode]) {
                    q.offer(Arrays.asList(aNode, curL + 1));
                    vis[aNode] = true;
                }
            }
        }
        
        return -1;
    }
}

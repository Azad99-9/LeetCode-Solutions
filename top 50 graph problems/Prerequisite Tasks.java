class Solution {
    public boolean isPossible(int N,int P, int[][] prerequisites)
    {
        int[] indegree = new int[N];
        Map<Integer, ArrayList<Integer>> adj = new HashMap<>();
        
        for (int[] pSite : prerequisites) {
            indegree[pSite[0]]++;
            
            if (!adj.containsKey(pSite[1])) {
                adj.put(pSite[1], new ArrayList<>());
            } 
            
            adj.get(pSite[1]).add(pSite[0]);
        }
        
        Queue<Integer> q = new LinkedList<>();
        
        for (int task = 0; task < N; task++) {
            if (indegree[task] == 0) q.offer(task);
        }
        
        while (!q.isEmpty()) {
            int curTask = q.poll();
            
            if (adj.containsKey(curTask)) {
                for (int nextTask : adj.get(curTask)) {
                    indegree[nextTask]--;
                    if (indegree[nextTask] == 0) {
                        q.offer(nextTask);
                    }
                }
            }
        }
        
        for (int degree : indegree) {
            if (degree != 0) return false;
        }
        
        return true;
    }
    
}

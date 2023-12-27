class Solution
{
    static int[] findOrder(int n, int m, ArrayList<ArrayList<Integer>> prerequisites) 
    {
        ArrayList<ArrayList<Integer>> dg = new ArrayList<>();
        
        int[] indegree = new int[n];
        
        int[] ans = new int[n];
        
        for (int i = 0; i < n; i++) dg.add(new ArrayList<>());
        
        for (ArrayList<Integer> psite : prerequisites) {
            indegree[psite.get(0)]++;
            dg.get(psite.get(1)).add(psite.get(0));
        }
        
        Queue<Integer> q = new LinkedList<>();
        
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }
        
        int index = 0;
        
        while (!q.isEmpty()) {
            int cur = q.poll();
            
            ans[index++] = cur;
            
            for (int ad : dg.get(cur)) {
                indegree[ad]--;
                if (indegree[ad] == 0) {
                    q.offer(ad);
                }
            }
        }
        
        if (index == n) return ans;
        
        return new int[0];
        
    }
}

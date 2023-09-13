class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] ans = new int[numCourses];
        int index = 0;
        int[] ind = new int[numCourses];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        // boolean[] vis = new boolean[numCourses];

        for (int i = 0; i < numCourses; i++) adj.add(new ArrayList<>());

        for (int[] edge: prerequisites) {
            int u = edge[1];
            int v = edge[0];

            ind[v]++;
            adj.get(u).add(v);
        }

        for (int node = 0; node < numCourses; node++) {
            if (ind[node] == 0) q.offer(node);
        }

        while(!q.isEmpty()) {
            int curNode = q.poll();

            ans[index++] = curNode;
            for (int adjNode: adj.get(curNode)) {
                ind[adjNode]--;
                    if (ind[adjNode] == 0) {
                        q.offer(adjNode);
                        
                    }
            }
        }

        if (index == ans.length) return ans;
        return new int[]{};
    }
}
class Solution {
	// T - O( v + e )
	// s - O( v )
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> adj_list = new HashMap<>();
        int[] indegree = new int[numCourses];
        for(int[] edge : prerequisites) {
            adj_list.computeIfAbsent(edge[0], k -> new ArrayList<>()).add(edge[1]);
            ++indegree[edge[1]];
        }
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < indegree.length; i++) {
            if(indegree[i] == 0)
                q.offer(i);
        }

        int num_nodes = 0;
        while( !q.isEmpty()) {
            int node = q.poll();
            ++num_nodes;

            if(adj_list.containsKey(node))
                for( int neighbor : adj_list.get(node))
                    if(--indegree[neighbor] == 0)
                        q.offer(neighbor);
        }

        return num_nodes == numCourses;
    }
}

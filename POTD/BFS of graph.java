class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        q.offer(0);
        boolean vis[] = new boolean[V];
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int cur = q.poll();
                ans.add(cur);
                for (int j = 0; j < adj.get(cur).size(); j++) {
                    int adjNode = adj.get(cur).get(j);
                    if (!vis[adjNode]) {
                        q.offer(adjNode);
                        vis[adjNode] = true;
                    }
                }
            }
        }
        return ans;
    }
}
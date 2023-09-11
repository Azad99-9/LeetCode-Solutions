class Solution {
    private boolean check(int start, int v, int[][] adj, int[] color) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        color[start] = 0;
        while(!q.isEmpty()) {
            int node = q.peek();
            q.poll();

            for(int item : adj[node]) {
                //if the adjacent node is yet not colored
                //we will give the opposite color of the node
                if(color[item] == -1) {
                    color[item] = 1 - color[node];
                    q.offer(item);
                }

                // is the adjacent guy having the same color
                // someone did color it on some other path
                else if(color[item] == color[node]) return false;
            }
        }
        return true;
    }

    public boolean isBipartite(int[][] graph) {
    // T - same as bfs
    // s - same as bfs
     int[] color = new int[graph.length];
     for(int i = 0; i < color.length; i++) color[i] = -1;

     for(int i = 0; i < color.length; i++) {
         if(color[i] == -1) {
             if(!check(i, color.length, graph, color)) return false;
         }
     }

     return true;
    }
}

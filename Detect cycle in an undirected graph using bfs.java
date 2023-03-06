class Pair {
    int first, second;
    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Solution {
    // Function to detect cycle in an undirected graph. //bfs // T - O( v + e )
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[] = new boolean[V];
        for(int i = 0; i < V; i++) vis[i] = false;
        for(int i = 0; i < V; i++) {
            if(vis[i] == false) {
                if(checkForCycle(i, V, adj, vis)) return true;
            }
        }
        return false;
    }
    
    public boolean checkForCycle(int src, int V, ArrayList<ArrayList<Integer>> adj, boolean[] vis) {
        vis[src] = true;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(src, -1));
        while(!q.isEmpty()) {
            int node = q.peek().first;
            int parent = q.peek().second;
            q.poll();
            
            for(int adjNode : adj.get(node)) {
                if(vis[adjNode] == false) {
                    vis[adjNode] = true;
                    q.offer(new Pair(adjNode, node));
                } else if (parent != adjNode) {
                    return true;
                }
            }
        }
        return false;
    }
}

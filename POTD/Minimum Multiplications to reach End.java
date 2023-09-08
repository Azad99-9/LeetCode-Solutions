class Pair {
    int steps;
    int node;
    Pair (int _steps, int _node) {
        steps = _steps;
        node = _node;
    }
}

class Solution {
    int minimumMultiplications(int[] arr, int start, int end) {
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(0, start));
        
        if (start == end) return 0;
        
        int[] dist = new int[100000];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;
        
        while (!q.isEmpty()) {
            // System.out.println("hi");
            int node = q.peek().node;
            int steps = q.peek().steps;
            
            q.poll();
            
            for (int adjNode: arr) {
                int num = (adjNode * node) % 100000;
                if (steps + 1 < dist[num]) {
                    dist[num] = steps + 1;
                    if (num == end) return steps + 1;
                    q.offer(new Pair(steps + 1, num));
                    
                }
            }
        }
        
        return -1;
    }
}
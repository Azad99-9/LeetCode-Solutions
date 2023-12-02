class Solution{
    static int minThrow(int N, int arr[]){
        Map<Integer, Integer> snakes = new HashMap<>();
        Map<Integer, Integer> ladders = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int s = arr[2*i];
            int d = arr[2*i + 1];
            if (s > d) snakes.put(s, d);
            if (s < d) ladders.put(s, d);
        }
        
        
        Queue<Integer> q = new LinkedList<>();
        
        q.offer(1);
        
        int diceThrows = 0;
        
        while (!q.isEmpty()) {
            int size = q.size();
            for (int j = 0; j < size; j++) {
                int cp = q.poll();
                
                if (cp == 30) return diceThrows;
                
                for (int i = 1; i <= 6; i++) {
                    int np = cp + i;
                    
                    if (np > 30) break;
                    if (snakes.containsKey(np)) continue;
                    if (ladders.containsKey(np)) np = ladders.get(np);
                    
                    q.offer(np);
                }
            }
            diceThrows++;
        }
        
        return diceThrows;
    }
}

class Solution
{
    private String topo(Map<Character, ArrayList<Character>> graph) {
        Map<Character, Boolean> vis = new HashMap<>();
        StringBuilder ans = new StringBuilder();
        
        Map<Character, Integer> in = new HashMap<>();
        
        for (Character k: graph.keySet()) {
            in.put(k, 0);
            vis.put(k, false);
        }
        
        for (Character k: graph.keySet()) {
            for (Character adj: graph.get(k)) {
                in.put(adj, in.get(adj) + 1);
            }
        }
        
        Queue<Character> q = new LinkedList<>();
        
        for (Character k: graph.keySet()) {
            if (in.get(k) == 0 && !vis.get(k)) q.offer(k);
        }
        
        while (!q.isEmpty()) {
            int size = q.size();
            
            for (int i = 0; i < size; i++) {
                Character cur = q.poll();
            
                vis.put(cur, true);
                ans.append(String.valueOf(cur));
                for (Character adj: graph.get(cur)) {
                    in.put(adj, in.get(adj) - 1);
                }
            }
            
            for (Character k: in.keySet()) {
                if (!vis.get(k) && in.get(k) == 0) q.offer(k);
            }
        }
        
        return ans.toString();
    }
    
    public String findOrder(String [] dict, int N, int K)
    {
        Set<Character> se = new HashSet<>();
        for (int i = 0; i < dict.length; i++) {
            for (int j = 0; j < dict[i].length(); j++) se.add(dict[i].charAt(j));
        }
        
        Map<Character, ArrayList<Character>> graph = new HashMap<>();
        for (Character ch: se) {
            graph.put(ch, new ArrayList<>());
        }
        
        for (int i = 0; i < N-1; i++) {
            int j = 0;
            while (j < dict[i].length() && j < dict[i+1].length()) {
                if (dict[i].charAt(j) != dict[i+1].charAt(j)) {
                    graph.get(dict[i].charAt(j)).add(dict[i+1].charAt(j));
                    break;
                }
                j++;
            }
        }
        
        return topo(graph);
    }
}

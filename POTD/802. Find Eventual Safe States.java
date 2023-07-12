class Solution {
    public List<List<Integer>> reverse(int[][] g) {
        List<List<Integer>> rev = new LinkedList<>();
        for (int i = 0; i < g.length; i++) rev.add(new LinkedList<>());
        for (int i = 0; i < g.length; i++) {
            for (int adNode: g[i]) {
                rev.get(i).add(adNode);
            }
        }
        return rev;
    }

    public boolean dfs(int i, boolean[] vis, int[] safe, List<List<Integer>> g, Set<Integer> terminals) {
        if (vis[i]) {
            safe[i] = 0;
            return false;
        }
        if (safe[i] != -1) return safe[i] == 0? false: true;

        if (terminals.contains(i)) return true;
        boolean s = true; vis[i] = true;
        for (int cn: g.get(i)) {
            if (s) s = dfs(cn, vis, safe, g, terminals);
            else {
                safe[i] = 0;
                s = false;
                return false;
            }
        }

        vis[i] = false;
        safe[i] = s ? 1 : 0;
        return  s;
    }

    public List<Integer> eventualSafeNodes(int[][] graph) {
        // for (int i = 0; i < graph.length; i++) {
        //     for (int j = 0; j < graph[i].length; j++) {
        //         System.out.print(graph[i][j] + " ");

        //     }
        //     System.out.println();
        // }
        // return new LinkedList<>();
        int[] safe = new int[graph.length];
        Set<Integer> terminals = new HashSet<>();
        Arrays.fill(safe, -1);
        for (int i = 0; i < graph.length; i++) {
            if (graph[i].length == 0) {
                terminals.add(i);
                safe[i] = 1;
            }
        }

        System.out.println(terminals);
        List<List<Integer>> rev = reverse(graph);

        boolean[] vis = new boolean[graph.length];
        
        

        for (int node = 0; node < graph.length; node++) {
            safe[node] = dfs(node, vis, safe, rev, terminals) == true ? 1 : 0;
        }

        List<Integer> ans = new LinkedList<>();
        for (int i = 0; i < safe.length; i++) {
            if (safe[i] == 1) ans.add(i);
        }

        return ans;

    }
}
import java.util.*;
public class Solution {
    private static void dfs(int node, Stack<Integer> st, ArrayList<ArrayList<Integer>> adj, int vis[]) {
        vis[node] = 1;
        for(Integer it : adj.get(node))
            if(vis[it] == 0) dfs(it, st, adj, vis);
        st.push(node);
    }
    
    private static void revDfs(int node, ArrayList<ArrayList<Integer>> transpose, int[] vis, List<Integer> ans) {
        vis[node] = 1;
        ans.add(node);
        for(Integer it : transpose.get(node)) {
            if(vis[it] == 0) revDfs(it, transpose, vis, ans);
        }
    }

    // T - O(V + E)
    public static List<List<Integer>> stronglyConnectedComponents(int n, int[][] edges) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++) adj.add(new ArrayList<>());

        // create a adjacency list
        for(int i = 0; i < edges.length; i++) {
            int[] edge = edges[i];
            adj.get(edge[0]).add(edge[1]);
        }

        int vis[] = new int[n];
        // apply topological sort
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++)
            if(vis[i] == 0) dfs(i, st, adj, vis);

        ArrayList<ArrayList<Integer>> transpose = new ArrayList<>();

        for(int i = 0; i < n; i++)
            transpose.add(new ArrayList<>());

        // create transpose of given graph
        for(int i = 0; i < n; i++) {
            vis[i] = 0;
            for(Integer it : adj.get(i)) transpose.get(it).add(i);
        }

        List<List<Integer>> ans = new ArrayList<>();

        // now apply dfs on transpose graph based on the priority of nodes in topological sort
        while(st.size() > 0) {
            int node = st.peek();
            st.pop();
            if(vis[node] == 0) {
                List<Integer> tempList = new ArrayList<>();
                ans.add(tempList);
                revDfs(node, transpose, vis, tempList);
            }
        }

        return ans;
    }
}


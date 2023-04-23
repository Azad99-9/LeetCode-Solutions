//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String input_line[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input_line[0]);
            int M = Integer.parseInt(input_line[1]);
            
            input_line = read.readLine().trim().split("\\s+");
            ArrayList<ArrayList<Integer>> Edges = new ArrayList<ArrayList<Integer>>(); 
            for(int i = 0; i < M; i++){
                ArrayList<Integer> e = new ArrayList<Integer>();
                e.add(Integer.parseInt(input_line[2*i]));
                e.add(Integer.parseInt(input_line[2*i+1]));
                Edges.add(e);
            }
            Solution ob = new Solution();
            if(ob.check(N, M, Edges)){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{   
    boolean dfs (int vertex, Set<Integer> visitedNodes, ArrayList<ArrayList<Integer>> edges, int m, int n, boolean pathExist) {
        visitedNodes.add(vertex);
        
        if(visitedNodes.size() == n) return true;
        
        for (ArrayList<Integer> edge : edges) {
            int u = edge.get(0);
            int v = edge.get(1);
            
            if (u == vertex && !visitedNodes.contains(v) && !pathExist) 
                pathExist = dfs(v, visitedNodes, edges, m, n, pathExist);
            else if (v == vertex && !visitedNodes.contains(u) && !pathExist)
                pathExist = dfs(u, visitedNodes, edges, m, n, pathExist);
        }
        
        visitedNodes.remove(vertex);
        return pathExist;
    }
    boolean check(int N, int M, ArrayList<ArrayList<Integer>> Edges) 
    { 
        boolean pathExist = false;
        int beginVertex= 1;
        while (!pathExist && beginVertex <= N) {
            pathExist = dfs(beginVertex++, new HashSet<>(), Edges, M, N, pathExist);
        }
        return pathExist;
    }
} 
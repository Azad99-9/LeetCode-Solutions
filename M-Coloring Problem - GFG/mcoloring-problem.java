//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tc = scan.nextInt();

        while (tc-- > 0) {
            int N = scan.nextInt();
            int M = scan.nextInt();
            int E = scan.nextInt();

            boolean graph[][] = new boolean[N][N];

            for (int i = 0; i < E; i++) {
                int u = scan.nextInt() - 1;
                int v = scan.nextInt() - 1;
                graph[u][v] = true;
                graph[v][u] = true;
            }

            System.out.println(new solve().graphColoring(graph, M, N) ? 1 : 0);
        }
    }
}

// } Driver Code Ends


class solve {
    // Function to determine if graph can be coloured with at most M colours
    // such
    // that no two adjacent vertices of graph are coloured with same colour.
    public boolean canApplyColor(boolean adj[][], int clr, int[] clrs, int vertex, int N) {
        for (int i = 0; i < N; i++) 
            if (adj[vertex][i] && clrs[i] == clr) return false;
        return true;
    }
    
    public boolean color(boolean[][] adj, int[] clrs, int vertex, int n, int m, boolean colored) {
        if (n == vertex) return true;
        
        for (int clr = 0; clr < m; clr++) {
            if (canApplyColor(adj, clr, clrs, vertex, n) && !colored) {
                clrs[vertex] = clr;
                colored = color(adj, clrs, vertex + 1, n, m, colored);
                clrs[vertex] = -1;
            }
        }
        
        return colored;
    }
    
    public boolean graphColoring(boolean graph[][], int m, int n) {
        boolean colored = false;
        int[] clrs = new int[n+1];
        for (int i = 0; i < n; i++) clrs[i] = -1;
        colored = color(graph, clrs, 0, n, m, colored);
        return colored;
    }
}
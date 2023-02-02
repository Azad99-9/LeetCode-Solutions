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


//T-O(n^m)
//s-O(n)+O(n)
class solve {
    // Function to determine if graph can be coloured with at most M colours
    // such
    // that no two adjacent vertices of graph are coloured with same colour.
    public boolean possible(int col, boolean[][] g, int[] colors, int node, int n) {
        for(int i= 0; i< n; i++) {
            if(g[node][i])
                if(colors[i] == col)
                    return false;
        }
        return true;
    }
    
    
    public boolean color(boolean[][] g, int[] colors, int node, int n, int m) {
        if(node == n)
            return true;
        for(int col = 1; col<= m; col++) {
            if(possible(col, g, colors, node, n)) {
                colors[node] = col;
                if(color(g, colors, node+1, n, m)) return true;
                colors[node] = 0;
            }
        }
        return false;
    }
    
    public boolean graphColoring(boolean graph[][], int m, int n) {
        int[] colors = new int[n];
        return color( graph, colors, 0, n, m) ;
    }
}
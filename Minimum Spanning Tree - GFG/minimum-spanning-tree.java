//{ Driver Code Starts


import java.util.*;
import java.io.*;
import java.lang.*;

public class Main{
	static BufferedReader br;
	static PrintWriter ot;
    public static void main(String args[]) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		ot = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine().trim());
		while(t-- > 0){
			String s[] = br.readLine().trim().split(" ");
			int V = Integer.parseInt(s[0]);
			int E = Integer.parseInt(s[1]);
			int edges[][] = new int[E][3];
			for(int i = 0; i < E; i++){
				s = br.readLine().trim().split(" ");
				edges[i][0] = Integer.parseInt(s[0]);
				edges[i][1] = Integer.parseInt(s[1]);
				edges[i][2] = Integer.parseInt(s[2]);
			}
			ot.println(new Solution().spanningTree(V, E, edges));
		}
		ot.close();
	}
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    
    static int findRoot (int x, int parent[]) {
        if(parent[x] > -1) {
            parent[x] = findRoot (parent[x], parent);
            return parent[x];
        }
        return x;
    }
    
    static boolean Union (int x, int y, int[] parent) {
        int xRoot = findRoot(x, parent);
        int yRoot = findRoot(y, parent);
        if(xRoot == yRoot) return false;
        if(parent[xRoot] < parent[yRoot]) {
            parent[yRoot] = xRoot;
        }
        else if(parent[yRoot] > parent[xRoot]) {
            parent[xRoot] = yRoot;
        }
        else {
            parent[yRoot] = xRoot;
            parent[xRoot] -= 1;
        }
        return true;
    }
    
	static int spanningTree(int V, int E, int edges[][]){
	    int[] parent = new int[V];
	    for(int i = 0; i < V; i++) parent[i] = -1;
	    PriorityQueue<Integer[]> pq = new PriorityQueue<>((x,y) -> x[2] - y[2]);
	    
	    for(int[] edge : edges) {
	        Integer[] temp = new Integer[3];
	        temp[0] = edge[0];
	        temp[1] = edge[1];
	        temp[2] = edge[2];
	        pq.offer(temp);
	    }
	    int sum = 0;
	    
	    for(int i = 0; i < E; i++) {
	        Integer[] edge = pq.poll();
	        if(Union(edge[0], edge[1], parent)) sum += edge[2];
	    }
	    
	    return sum;
	}
}
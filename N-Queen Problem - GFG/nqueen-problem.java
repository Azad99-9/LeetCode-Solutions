//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0) {
            int n = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            ArrayList<ArrayList<Integer>> ans = ob.nQueen(n);
            if(ans.size() == 0)
                System.out.println("-1");
            else {
                for(int i = 0;i < ans.size();i++){
                    System.out.print("[");
                    for(int j = 0;j < ans.get(i).size();j++)
                        System.out.print(ans.get(i).get(j) + " ");
                    System.out.print("] ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static boolean isPossible(boolean[] ddl, boolean[] ddr, boolean[] rows, int row, int col, int n) {
        if (ddl[row + col]) return false;
        else if (ddr[n - (row - col)]) return false;
        else if (rows[row]) return false;
        else return true;
    }
    
    static void solve (int col, boolean[] ddl, boolean[] ddr, boolean[] rows, 
    int n, ArrayList<ArrayList<Integer>> possibleSolutions, ArrayList<Integer> solution) {
        if (col == n) {
            possibleSolutions.add(new ArrayList<>(solution));
            return;
        }
        for (int row = 0; row < n; row++) {
            if (isPossible(ddl, ddr, rows, row, col, n)) {
                ddr[n - (row - col)] = true;
                ddl[row + col] = true;
                rows[row] = true;
                solution.add(row + 1);
                solve(col + 1, ddl, ddr, rows, n, possibleSolutions, solution);
                solution.remove(solution.size() - 1);
                rows[row] = false;
                ddl[row + col] = false;
                ddr[n - (row - col)] = false;
            }
        }
    }
    
    static ArrayList<ArrayList<Integer>> nQueen(int n) {
        boolean[] ddl = new boolean[n*2];
        boolean[] ddr = new boolean[n*2];
        boolean[] rows = new boolean[n];
        ArrayList<Integer> solution = new ArrayList<>();
        ArrayList<ArrayList<Integer>> possibleSolutions = new ArrayList<>();
        solve(0, ddl, ddr, rows, n, possibleSolutions, solution);
        return possibleSolutions;
        
    }
}
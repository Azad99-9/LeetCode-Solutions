//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static boolean inBox(int x, int y, int n, int[][] visited) {
        if(x >= 0 && x < n && y >= 0 && y< n && visited[x][y] == 0) return true;
        return false;
    }
    
    public static void checkPaths(int x, int y, int[][] m, int n, String ds, ArrayList<String> ans, int[][] visited) {
        if(x == n-1 && y == n-1) {
            ans.add(new String(ds));
            return;
        }
        if(inBox(x+1,y,n,visited) && m[x+1][y] != 0) {
            ds+= "D";
            visited[x+1][y] = 1;
            checkPaths(x+1,y,m,n,ds,ans,visited);
            visited[x+1][y] = 0;
            ds = ds.substring(0,ds.length()-1)+"";
        }
        if(inBox(x,y+1,n,visited) && m[x][y+1] != 0) {
            ds+= "R";
            visited[x][y+1] = 1;
            checkPaths(x,y+1,m,n,ds,ans,visited);
            visited[x][y+1] = 0;
            ds = ds.substring(0,ds.length()-1)+"";
        }
        if(inBox(x-1,y,n,visited) && m[x-1][y] != 0) {
            ds+= "U";
            visited[x-1][y] = 1;
            checkPaths(x-1,y,m,n,ds,ans,visited);
            visited[x-1][y] = 0;
            ds = ds.substring(0,ds.length()-1)+"";
        }
        if(inBox(x,y-1,n,visited) && m[x][y-1] != 0) {
            ds+= "L";
            visited[x][y-1] = 1;
            checkPaths(x,y-1,m,n,ds,ans,visited);
            visited[x][y-1] = 0;
            ds = ds.substring(0,ds.length()-1)+"";
        }
        
    }
    
    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> ans = new ArrayList<>();
        int[][] visited = new int[n][n];
        visited[0][0] = 1;
        String ds = "";
        if(m[0][0] != 0)
            checkPaths(0,0,m,n,ds,ans,visited);
        return ans;
    }
}
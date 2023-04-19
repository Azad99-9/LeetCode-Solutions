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
    public static boolean canMove(int i, int j, int n, int[][] m, boolean[][] visited) {
        if (i >= 0 && j >= 0 && i < n && j < n && m[i][j] == 1 && !visited[i][j]) {
            return true;
        }
        return false;
    }
    
    public static void ratMove (int i, int j, int[][] m, int n, ArrayList<String> ans, String str, boolean[][] visited) {
        if (canMove(i, j, n, m, visited)) {
            if (i == n - 1 && j == n - 1) {
                ans.add(str);
                return;
            }
            visited[i][j] = true;
            str += "D";
            ratMove(i + 1, j, m, n, ans, str, visited);
            str = str.substring(0, str.length() - 1);
            
            str += "R";
            ratMove(i, j + 1, m, n, ans, str, visited);
            str = str.substring(0, str.length() - 1);
            
            str += "U";
            ratMove(i - 1, j, m, n, ans, str, visited);
            str = str.substring(0, str.length() - 1);
            
            str += "L";
            ratMove(i, j - 1, m, n, ans, str, visited);
            str = str.substring(0, str.length() - 1);
            
            visited[i][j] = false;
        }
    }
    
    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> ans = new ArrayList<>();
        boolean[][] visited = new boolean[n][n];
        ratMove(0, 0, m, n, ans, "", visited);
        return ans;
    }
}

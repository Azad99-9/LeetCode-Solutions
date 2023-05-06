//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] grid = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.orangesRotting(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends

class Pair {
    int row;
    int col;
    int time;
    Pair(int _row, int _col, int _tm) {
        row = _row;
        col = _col;
        time = _tm;
    }
}
class Solution
{
    //Function to find minimum time required to rot all oranges. 
    public int orangesRotting(int[][] grid)
    {
        int n= grid.length;
        int m= grid[0].length;

        Queue<Pair> q = new LinkedList<>();

        int[][] visited = new int[n][m];
        int cntFresh = 0;
        for(int i= 0; i< n; i++) {
            for(int j= 0; j< m; j++) {
                if(grid[i][j] == 2) {
                    q.add(new Pair(i,j,0));
                    visited[i][j] = 2;
                } else 
                    visited[i][j] = 0;
                
                if(grid[i][j] == 1) cntFresh++;
            }
        }

        int time = 0;
        int[] drow = {-1, 0, 1, 0};
        int[] dcol = { 0, 1, 0, -1};
        int cnt = 0;
        while(!q.isEmpty()) {
            int r = q.peek().row;
            int c = q.peek().col;
            int t = q.peek().time;
            time = Math.max(time, t);
            q.poll();
            for(int i= 0; i<4; i++) {
                int nextRow = r+drow[i];
                int nextCol = c+dcol[i];
                if(nextRow >= 0 && nextRow < n && nextCol >= 0 && nextCol < m && visited[nextRow][nextCol] == 0
                && grid[nextRow][nextCol] == 1) {
                    q.offer(new Pair(nextRow, nextCol, t+1));
                    visited[nextRow][nextCol] = 2;
                    cnt++;
                }
            }
        }
        if(cnt != cntFresh) return -1;
        return time;
    }
}
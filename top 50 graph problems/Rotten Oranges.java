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


class Solution
{
    //Function to find minimum time required to rot all oranges. 
    private boolean valid(int i, int j, int[][] graph) {
        int n = graph.length;
        int m = graph[0].length;
        return (i < n && i > -1 && j < m && j > -1 && graph[i][j] != 0 && graph[i][j] != 2);
    }
    
    private int bfs(int[][] graph) {
        int n = graph.length;
        int m = graph[0].length;
        int cf = 0;
        
        Queue<int[]> q = new LinkedList<>();
        boolean[][] vis = new boolean[n][m];
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (graph[i][j] == 2) {
                    q.offer(new int[]{i, j});
                }
                
                if (graph[i][j] == 1) cf++;
            }
        }
        
        int cnt = 0;
        int time = 0;
        while(!q.isEmpty()) {
            int size = q.size();
            
            for (int i = 0; i < size; i++) {
                int[] cp = q.poll();
                int x = cp[0];
                int y = cp[1];
                // System.out.println(x + " " + y);
                
                for (int j = 0; j < 4; j++) {
                    int nx = x + dx[j];
                    int ny = y + dy[j];
                    // if (x == 1 && y == 0) System.out.println(nx+ " " + ny);
                    
                    if (valid(nx, ny, graph)) {
                        
                        graph[nx][ny] += 1;
                        q.offer(new int[]{nx, ny});
                        cnt++;
                        // vis[nx][ny] = true;
                    }
                }
            }
            
            // System.out.println(q.size());
            
            
            
            time++;
        }
        
        // System.out.println(cnt + " " + cf);
        
        if (cnt != cf) return -1;
        if (cf == 0) return 0;
        return time - 1;
    }
    public int orangesRotting(int[][] grid)
    {
        return bfs(grid);
    }
}

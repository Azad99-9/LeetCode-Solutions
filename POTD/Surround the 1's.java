//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] matrix = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++)
                    matrix[i][j] = Integer.parseInt(S[j]);
            }
            Solution ob = new Solution();
            int ans = ob.Count(matrix);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int  Count(int[][] matrix)
    {
        int n = matrix.length;
        int m = matrix[0].length;
        int ans = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int count = 0;
                if (matrix[i][j] == 1) {
                    for (int l = -1; l < 2; l++) {
                        for (int k = -1; k < 2; k++) {
                            if (i+l > -1 && i+l < n 
                            && j+k > -1 && j+k < m) {
                                if (matrix[i+l][j+k] == 0)
                                    count++;
                            }
                        }
                    }
                // System.out.println(count);
                if (count != 0 && (count & 1) == 0) ans++;
                }
            }
        }
        
        return ans;
    }
}
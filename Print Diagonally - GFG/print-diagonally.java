//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            
            int matrix[][] = new int[n][n];
            
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.downwardDiagonal(n, matrix);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static ArrayList<Integer> downwardDiagonal(int n, int A[][])
    {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int k = 0; k < n; k++) {
            int i = 0, j = k;
            for (int l = 0; l <= k; l++) {
                ans.add(A[i++][j--]);
            }
        }
        for (int k = n-1; k >= 1; k--) {
            int i = n - k, j = n - 1;
            for (int l = 1; l <= k; l++) {
                ans.add(A[i++][j--]);
            }
        }
        return ans;
    }
}

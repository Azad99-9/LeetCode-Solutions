import java.util.* ;
import java.io.*; 

public class Solution {
	static int f(int arr[], int i, int j, int[][] dp){
    
    // base condition
    if(i == j)
        return 0;
        
    if(dp[i][j]!=-1)
        return dp[i][j];
    
    int mini = Integer.MAX_VALUE;
    
    // partioning loop
    for(int k = i; k<= j-1; k++){
        
    int ans = f(arr,i,k,dp) + f(arr, k+1,j,dp) + arr[i-1]*arr[k]*arr[j];
        
    mini = Math.min(mini,ans);
        
    }
    
    return mini;
}

	public static int matrixMultiplication(int[] arr , int n) {
		int dp[][]= new int[n][n];
    
    // for(int row[]:dp)
    // Arrays.fill(row,-1);
    
    // int i =1;
    // int j = N-1;
    
    
    // return f(arr,i,j,dp);
	for(int i =0; i<n; i++) dp[i][i] = 0;
	for(int i = n-1; i>= 1; i--) {
		for(int j=i+1; j<n;j++) {
			int mini = (int)1e9;
			for(int k=i; k < j; k++){
				int steps = arr[i-1]*arr[k]*arr[j]+
				dp[i][k]+dp[k+1][j];
				if(steps<mini) mini = steps;
			}
			dp[i][j]=mini;
		}
	}
	return dp[1][n-1];
	}
}

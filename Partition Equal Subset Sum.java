class Solution{
    
    private static int perfectSum(int arr[],int n, int sum) 
	{ 
	    int[] next = new int[sum+1];
	    int[] cur = new int[sum+1];
	    int mod = (int)1e9+7;
	    
	    next[sum] = 1;
	    
	    for (int i = n-1; i > -1; i--) {
	        for (int curSum = sum; curSum > -1; curSum--) {
	            int pick = 0;
	            if (curSum + arr[i] <= sum) {
	                pick = next[curSum+ arr[i]];
	            }
	            int notPick = next[curSum];
	            cur[curSum] = (pick + notPick)%mod;
	        }
	        next = cur;
	        cur = new int[sum+1];
	    }
	    
	    return next[0];
	} 
    
    static int equalPartition(int N, int arr[])
    {
        int sum = 0;
        for (int i : arr) sum += i;
        
        if (sum % 2 != 0) return 0;
        
        int target = sum/2;
        
        return perfectSum(arr, N, target) != 0 ? 1 : 0;
    }
}
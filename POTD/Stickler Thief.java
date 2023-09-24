class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
        // int[] next = new int[n];
        int[] cur = new int[n];
        
        for (int i = n-1; i > -1; i--) {
            int pick = arr[i];
            if (i+2 < n) pick += cur[i+2];
            int notPick = 0;
            if (i+1 < n) notPick = cur[i+1];
            cur[i] = Math.max(pick, notPick);
        }
        
        return cur[0];
    }
}
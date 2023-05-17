class GFG
{
    long maxSum(long arr[] ,int n)
    {
        Arrays.sort(arr);
    
        int i = 0, j = n - 1;
        long maxSum = 0;
        
        boolean movedI = false;
        while(i != j) {
            maxSum += Math.abs(arr[i] - arr[j]);
            if (!movedI) {
                i++;
                movedI = true;
            } else {
                j--;
                movedI = false;
            }
        }
        
        maxSum += Math.abs(arr[i] - arr[0]);
        
        return maxSum;
    }
}
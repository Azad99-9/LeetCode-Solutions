class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {
        long totalSum = 0;
        for (long i : arr) totalSum += i;
        
        long curSum = 0;
        for (int i = 0; i < n; i++) {
            if (totalSum - (curSum + arr[i]) == curSum) return i+1;
            curSum += arr[i];
        }
        
        return -1;
    }
}

class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int a[] , int n)
    {
        
        if (n  == 1) return a[0] == 0;
        if (n == 2) return a[0]+a[1]  == 0;
        Arrays.sort(a);
        for (int i = 0; i < n-1; i++) {
            int c = i;
        int l = i+1;
        int r = n-1;
        while (l < r) {
            int curSum = a[l] + a[r] + a[c];
            if (curSum < 0) l++;
            else if (curSum > 0) r--;
            else return true;
        }
        }
        return false;
        
        
    }
}
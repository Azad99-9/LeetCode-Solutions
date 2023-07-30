class Solution 
{ 
    void swap (int l, int h, int[] a) {
        int t = a[l];
        a[l] = a[h];
        a[h] = t;
    }
    boolean checkSorted(int N, int A[]) 
    { 
        if (A.length == 1) return false;
        int swaps = 0;
        
        int n = A.length;
        int l = 0;
        int h = n-1;
        
        
        while (l < n) {
            while (swaps < 3 && A[l] - 1 != l) {
                swap(l, A[l] - 1, A);
                swaps++;
            }
            if (swaps > 2) return false;
            l++;
        }
        return swaps == 0 || swaps == 2;
    }
} 
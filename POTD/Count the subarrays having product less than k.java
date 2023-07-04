class Solution {
    
    public int countSubArrayProductLessThanK(long a[], int n, long k)
    {
        int l = 0;
        int r = 0;
        long prod = 1;
        
        int subarrs = 0;
        while (r < n) {
            
                prod = a[r] * prod;
                
            
                
                while (l < n && prod >= k) {
                    prod = prod / a[l];
                    l++;
                }
                if (l == n) return subarrs;
            
            subarrs += r-l+1;
            r++;
        }
        return subarrs;
    }
}
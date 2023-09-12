
class Solution {
    static int isPerfectNumber(long n) {
        if (n == 1) return 0;
        long sum = 1;
 
    // Find all divisors and add them
        for (long i = 2; i * i <= n; i++)
        {
            if (n % i==0)
            {
                sum = sum + i;
                if(i * i != n)
                    sum = sum + n / i;
                    
            }
        }
        // If sum of divisors is equal to
        // n, then n is a perfect number
        if (sum == n)
            return 1;
     
        return 0;
    }
};
class Solution
{
    //Function to find the first position with different bits.
    public static int posOfRightMostDiffBit(int m, int n)
    {
            
        // Your code here 
        if(m == n)
            return -1;
        int M = 0, N = 0, O = 1;
        while(m != 0 && n != 0){
            M = m % 2;
            N = n % 2;
            m = m / 2;
            n = n / 2;
            if(M != N)
                return O;
            O++;
        }
        return O;
            
    }
}



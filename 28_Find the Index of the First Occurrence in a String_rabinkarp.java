//T-O(n-m+1)
//s-O(1)

class Solution {
    public int strStr(String source, String subString) {
        if(subString.length() > source.length()) return -1;
        int randomPrime = 101;
        int d = 256;
        int m= subString.length();
        int n= source.length();
        int i,j;
        int subStringHash = 0;
        int targetHash = 0; //substring part of source
        int h = 1;

        for(i= 0; i< m-1; i++)
            h = (h*d) % randomPrime;

        for(i= 0; i< m; i++) {
            subStringHash = (d*subStringHash + subString.charAt(i)) % randomPrime;
            targetHash    = (d*targetHash + source.charAt(i)) % randomPrime;
        }

        //RollinHash Calculation
        for (i = 0; i <= n - m; i++) {
            if (targetHash == subStringHash) {
                for(j = 0; j < m; j++) {
                    if(source.charAt(i + j) != subString.charAt(j))
                        break;
                }
                if (j == m) 
                    return i;
            }

            if(i < n - m) {
                targetHash = (d * (targetHash - source.charAt(i) * h) + source.charAt(i + m)) % randomPrime;
                if(targetHash < 0) 
                    targetHash = targetHash + randomPrime;
            }
        }
        return -1;

    }
}

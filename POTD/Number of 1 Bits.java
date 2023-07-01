// User function Template for Java
class Solution {
    static int setBits(int N) {
        int divdend = N;
        int count = 0;
        do {
            int remainder = divdend % 2;
            if (remainder == 1) count++;
            divdend = divdend / 2;
        } while (divdend != 0);
        
        return count;
    }
}
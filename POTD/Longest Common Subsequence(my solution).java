class Solution
{
    //Function to find the length of longest common subsequence in two strings.
    static int lcs(int x, int y, String s1, String s2)
    {
        int[] cur = new int[y+1];
        int[] next = new int[y+1];
        
        for (int i = x-1; i > -1;  i--)  {
            for (int j = y-1; j > -1; j--) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    cur[j] = 1 + next[j+1];
                } else {
                    cur[j] = Math.max(next[j], cur[j+1]);
                }
            }
            next = cur;
            cur = new int[y+1];
        }
        
        return next[0];
    }
    
}
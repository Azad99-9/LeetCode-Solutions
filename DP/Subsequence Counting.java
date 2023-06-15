import java.util.* ;
import java.io.*; 
public class Solution {
static int prime = (int)(Math.pow(10,9)+7);    public static int recur(char[] s1, char[] s2, int ind1, int ind2, int[][] dp) {
     if(ind2<0)
        return 1;
    if(ind1<0)
        return 0;
    
    if(dp[ind1][ind2]!=-1)
        return dp[ind1][ind2];
    
    if(s1[ind1]==s2[ind2]){
        int leaveOne = recur(s1,s2,ind1-1,ind2-1,dp);
        int stay = recur(s1,s2,ind1-1,ind2,dp);
        
        return dp[ind1][ind2] = (leaveOne + stay)%prime;
    }
    
    else{
        return dp[ind1][ind2] = recur(s1,s2,ind1-1,ind2,dp);
    }
    }

    public static int subsequenceCounting(String t, String s, int lt, int ls) {
        // int[][] memoize = new int[lt][ls];
        // for (int i = 0; i < lt; i++) Arrays.fill(memoize[i], -1);
        // return recur(t.toCharArray(), s.toCharArray(), lt-1, ls-1, memoize);

        char[] s1 = t.toCharArray();
        char[] s2 = s.toCharArray();
        int[][] table = new int[lt+1][ls+1];
        for (int i = 0; i <= lt; i++) table[i][0] = 1;
        for (int i = 1; i <= lt; i++) {
            for (int j = 1; j <= ls; j++) {
                if(s1[i-1]==s2[j-1]){
        int leaveOne = table[i-1][j];
        int stay = table[i-1][j-1];
        
        table[i][j] = (leaveOne + stay)%prime;
    }
    
    else{
         table[i][j] = table[i-1][j];
    }
            }
        }
        return table[lt][ls];
    }

}
import java.util.* ;
import java.io.*; 
public class Solution {
    static int[][] lcs (String a, String b) {
        int n = a.length();
        int m = b.length();
        char[] aarr = a.toCharArray();
        char[] barr = b.toCharArray();

        int[][] table = new int[n+1][m+1];
        

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (aarr[i-1] == barr[j-1])
                    table[i][j] = 1 + table[i-1][j-1];
                else 
                    table[i][j] = Math.max(table[i-1][j], table[i][j-1]);
            }
        }

        return table;
    }
    public static String shortestSupersequence(String a, String b) {
        int[][] table = lcs(a, b);
        int i = a.length();
        int j = b.length();
        int index = table[i][j];
        // System.out.println(index);
        String ans = "";
         while (i > 0 && j > 0) {
    if (a.charAt(i - 1) == b.charAt(j - 1)) {
      ans += a.charAt(i-1);
      index--;
      i--;
      j--;
    } else if (table[i - 1][j] > table[i][j - 1]) {
        ans += a.charAt(i-1);
        i--;
    } else {
        ans += b.charAt(j-1);
        j--;
    }
  }
        while (i > 0) {
            ans += a.charAt(i-1);
            i--;
        }
        while (j > 0) {
             ans += b.charAt(j-1);
             j--;
        }
        
        return new StringBuilder(ans).reverse().toString();
    }

}
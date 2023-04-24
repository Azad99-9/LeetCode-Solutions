//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int k = sc.nextInt();
                    String str = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.findMaximumNum(str, k));
                }
        }
}
// } Driver Code Ends




class Solution
{
    //Function to find the largest number after k swaps.
    public static String solve(char[] str, int k, String max) {
        if (k == 0) return max;
        
        for (int i = 0; i < str.length - 1; i++) {
            for (int j = i+1; j < str.length; j++) {
                if (str[i] < str[j]) {
                    char tmp = str[i];
                    str[i] = str[j];
                    str[j] = tmp;
                    
                    if (max.compareTo(String.valueOf(str)) < 0) max = String.valueOf(str);
                    
                    max = solve(str, k-1, max);
                    
                    char c = str[i];
                    str[i] = str[j];
                    str[j] = c;
                }
            }
            
        }
         return max;
    }
    
    public static String findMaximumNum(String str, int k)
        {
            String max = str;
            return solve(str.toCharArray(), k, max);
        }
}
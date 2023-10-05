//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        int l = 0;
        int r = -1;
        int[] chars = new int[26];
        int unq = 0;
        int n = s.length();
        int ans = 0;
        
        while (r < n) {
            r++;
            if (r < n) {
                chars[s.charAt(r) - 'a']++;
                if (chars[s.charAt(r) - 'a'] == 1) unq++;
            }
            
            if (unq > k) {
                ans = Math.max(ans, r - l);
            }
                
            while (l < r && unq > k) {
                chars[s.charAt(l) - 'a']--;
                if (chars[s.charAt(l) - 'a'] == 0) unq--;
                l++;
            }
            // System.out.println(l);
        }
        
        if (unq == k) ans = Math.max(ans, r - l);
        
        return ans == 0 ? -1 : ans;
    }
}
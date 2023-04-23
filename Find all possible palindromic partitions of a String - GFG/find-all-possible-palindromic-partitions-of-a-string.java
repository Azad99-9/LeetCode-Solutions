//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();

            Solution ob = new Solution();
            ArrayList<ArrayList<String>> allPart = ob.allPalindromicPerms(S);
            
            for (int i=0; i<allPart.size(); i++)  
            { 
                for (int j=0; j<allPart.get(i).size(); j++) 
                { 
                    System.out.print(allPart.get(i).get(j) + " "); 
                } 
                System.out.println(); 
            } 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        } return true;
    }
    
    static void solve(String s, int i, ArrayList<ArrayList<String>> allpp, ArrayList<String> curpp, int n) {
        if (i == n) {
            
            allpp.add(new ArrayList<>(curpp));
            
            return;
        }
        
        for (int j = i; j < n; j++) {
            String subString = s.substring(i, j+1);
            if (isPalindrome(subString)) {
                
                curpp.add(subString);
                
                solve (s, j+1, allpp, curpp, n);
                
                curpp.remove(curpp.size() - 1);
            }
        }
        
    }
    
    static ArrayList<ArrayList<String>> allPalindromicPerms(String S) {
        ArrayList<ArrayList<String>> allpp = new ArrayList<>();
        solve(S, 0, allpp, new ArrayList<>(), S.length());
        return allpp;
    }
};
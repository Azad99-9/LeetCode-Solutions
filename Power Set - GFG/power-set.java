//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            List<String> ans = ob.AllPossibleStrings(s);
            for(String i: ans)
                System.out.print(i + " ");
            System.out.println();
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public List<String> AllPossibleStrings(String s)
    {
       int n = s.length();
	ArrayList<String>ans=new ArrayList<>();
	for (int num = 0; num < (1 << n); num++) {
		String sub = "";
		for (int i = 0; i < n; i++) {
			//check if the ith bit is set or not
			if ((num & (1 << i))!=0) {
				sub += s.charAt(i);
			}
		}
		if (sub.length() > 0) {
			ans.add(sub);
		}
	}
	Collections.sort(ans);
	return ans;
    }
}
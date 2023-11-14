//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException{
		
		//taking input using BufferedReader class
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//taking total count of testcases
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    //Reading the two Strings
		    String s1 = br.readLine();
		    String s2 = br.readLine();
		    
		    //Creating an object of class Rotate
		    Solution obj = new Solution();
		    
		    //calling areRotations method 
		    //of class Rotate and printing
		    //"1" if it returns true
		    //else "0"
		    if(obj.areRotations(s1,s2))
		    {
		        System.out.println("1");
		    }
		    else
		    {
		        System.out.println("0");
		    }
		}
	}
}
// } Driver Code Ends



class Solution
{
    private static StringBuilder rotateByOneUnit(StringBuilder s, int direction, int index) {
        // 1 clockwise -1 anticlockwise
        int n = s.length();
        
        StringBuilder firstPart = new StringBuilder(s.substring(index));
        StringBuilder secondPart = new StringBuilder(s.substring(0, index));
        // System.out.println(firstPart + " " + secondPart + " " + index);
        return firstPart.append(secondPart);
    }
    
    //Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2)
    {
        int n = s1.length();
        
        if (n == 1) return s1.equals(s2);
        if (s1.equals(s2)) return true;
        
        StringBuilder clockWiseStr = new StringBuilder(s1);
        StringBuilder antiClockWiseStr = new StringBuilder(s1);
        int clockWise = 1, antiClockWise = -1;
        
        for (int i = 1; i < n; i++) {
            if (s1.charAt(i) == s2.charAt(0) && s1.charAt(i-1) == s2.charAt(n-1)) {
                
                StringBuilder tmp = rotateByOneUnit(clockWiseStr, 1, i);
                // System.out.println(tmp + " " + i);
                if (tmp.toString().equals(s2)) return true;
            }
        }
        
        return false;
    }
    
}

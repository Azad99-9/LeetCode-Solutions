//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        StringBuilder st = new StringBuilder(str);
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            st.setCharAt(i, str.charAt(j));
            st.setCharAt(j, str.charAt(i));
            i++; j--;
        }
        return st.toString();
    }
}
//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
       int count = 1;
       int ans = a[0];
       for (int i = 1; i < a.length; i++) {
           if (ans == a[i]) count++;
           else {
               count--;
               if (count == 0) {ans = a[i]; count++;}
           }
       }
       count = 0;
       for (int i = 0; i < a.length; i++) {
           if (a[i] == ans) count++;
       }
       if (count <= size / 2) return -1;
       else return ans;
    }
}
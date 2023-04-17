//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Driver
{
    public static void main(String args[]) 
	{ 
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int []a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            
            int  m= sc.nextInt();
            int []b = new int[m];
            for (int i = 0; i < m; i++) b[i] = sc.nextInt();
            
            double res = new GFG().medianOfArrays(n, m, a, b);
            
            if (res == (int)res) System.out.println ((int)res);
            else System.out.println (res);
        }
    		
	} 
}
// } Driver Code Ends


//User function Template for Java

class GFG 
{ 
    static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
        int totalElements = m+n;
        int mid = Integer.MIN_VALUE;
        int midminus1 = Integer.MIN_VALUE;
        int count = totalElements / 2 + 1;
        int i = 0;
        int j = 0;
        while (i < a.length && j < b.length && count != 0) {
            count--;
            if (a[i] <= b[j]) {
                midminus1 = mid;
                mid = a[i];
                i++;
                
            } else {
                midminus1 = mid;
                mid = b[j];
                j++;
            }
        }
        while (i < a.length && count != 0) {
            count--;
            midminus1 = mid;
            mid = a[i];
            i++;
        }
        while (j < b.length && count != 0) {
            count--;
            midminus1 = mid;
            mid = b[j];
            j++;
        }
        if (totalElements % 2 == 0) return (double) (mid + midminus1) / 2;
        else return (double) mid;
    }
}
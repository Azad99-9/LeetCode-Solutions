//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.minSum(a, n));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution {
    
    public static long minSum(int arr[], int n)
    {
        Arrays.sort(arr);
        int[] newArrangement = new int[n];
        
        int halfSize = n % 2 == 0 ? n / 2 : n / 2 + 1;
        int first = 0, second = halfSize;
        
        for (int i = 0; i < n; i+= 2) {
            newArrangement[first++] = arr[i];
            if (second < n) newArrangement[second++] = arr[i+1];
        }
        
        long placeValue =  (long)Math.pow(10, halfSize - 1);
        long num1 = 0;
        long num2 = 0;
        
        for (int i = 0; i < halfSize; i++) {
            num1 += placeValue * newArrangement[i];
            placeValue = placeValue / 10;
        }
        
        placeValue = (long)Math.pow(10, n - halfSize - 1);
        for (int i = halfSize; i < n; i++) {
            num2 += placeValue * newArrangement[i];
            placeValue = placeValue / 10;
        }
        
        return num1 + num2;
        
    }
}
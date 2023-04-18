//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    int n;
		    n=sc.nextInt();
		    
		    long arr[]=new long[n];
	
		    
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextLong();
		    }
            Solution ob = new Solution();
		    System.out.println(ob.findSubarray(arr,n));
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    //Function to count subarrays with sum equal to 0.
    
    public static long findSubarray(long[] arr ,int n) 
    {
        Long preSum = Long.valueOf(0);
        Long count = Long.valueOf(0);
        Map<Long, Long> tracker = new HashMap<>();
        tracker.put(Long.valueOf(0), Long.valueOf(1));
        for (int i = 0;  i < arr.length; i++) {
            preSum += arr[i];
            if (tracker.containsKey(preSum)) {
                count+= tracker.get(preSum);
                tracker.put(preSum, tracker.get(preSum)+1);
            } else {
                tracker.put(preSum,Long.valueOf(1));
            }
        }
        return count;
    }
}
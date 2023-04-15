//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long merge(long[] arr, int low, int high, int mid) {
        long n1 = mid - low + 1;
        long n2 = high - mid;
        long[] left = new long[(int)n1];
        long[] right = new long[(int)n2];
        int i = 0;
        int j = 0;
        long count = 0;
        for (; i < n1; i++) left[i] = arr[low+i];
        for (; j < n2; j++) right[j] = arr[mid+1+j];
        i = 0;
        j = 0;
        int k = low;
        while (i < n1 && j < n2) {
            if (left[i] > right[j]) {
                arr[k++] = right[j++];
                count+= n1- i;
            } else {
                arr[k++] = left[i++];
            }
        }
        while (i < n1) {
            arr[k++] = left[i++];
        }
        while (j < n2) {
            arr[k++] = right[j++];
        }
        return count;
    }
        
    static long mergeSort(int low, int high, long[] arr) {
        long count = 0;
        if (low < high) {
            int mid = (low + high) / 2;
            count += mergeSort(low, mid, arr);
            count += mergeSort(mid+1, high, arr);
            count += merge(arr, low, high, mid);
        }
        return count;
    }
    static long inversionCount(long arr[], long N)
    {
        long count = 0;
        count += mergeSort(0, (int)N-1, arr);
        return count;
    }
}
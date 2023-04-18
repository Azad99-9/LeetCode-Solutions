//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;


class GFG
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        int n;
        while(t-- > 0){
            n = sc.nextInt();
    
            Solution obj = new Solution();
            for(int i = 1; i <= n; i++)
            {
                int x =sc.nextInt();
                obj.insertHeap(x);
                System.out.println((int)Math.floor(obj.getMedian()));
            }
        }
        
        
    }
}


// } Driver Code Ends


class Solution
{
    static PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Comparator.reverseOrder());
    static PriorityQueue<Integer> minPQ = new PriorityQueue<>();
    
    public static boolean isEven () {
        return (maxPQ.size() + minPQ.size()) % 2 == 0 ? true : false;
    }
    
    //Function to insert heap.
    public static void insertHeap(int x)
    {
        if (maxPQ.isEmpty() || maxPQ.peek() < x) minPQ.offer(x);
        else maxPQ.offer(x);
        balanceHeaps();
    }
    
    //Function to balance heaps.
    public static void balanceHeaps()
    {
        boolean isEven = isEven();
        if (isEven) {
            while (maxPQ.size() != minPQ.size()) {
                if (maxPQ.size() < minPQ.size()) {
                    maxPQ.offer(minPQ.poll());
                } else {
                    minPQ.offer(maxPQ.poll());
                }
            }
        } else {
            while (maxPQ.size() != 1 + minPQ.size()) {
                if (maxPQ.size() < minPQ.size()) {
                    maxPQ.offer(minPQ.poll());
                } else {
                    minPQ.offer(maxPQ.poll());
                }
            }
        }
    }
    
    //Function to return Median.
    public static double getMedian()
    {
        boolean isEven = isEven();
        if (isEven) return (minPQ.peek() + maxPQ.peek()) / (double)2;
        else return maxPQ.peek();
    }
    
}
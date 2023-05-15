//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int[] a = IntArray.input(br, 3);
            
            
            int[] S1 = IntArray.input(br, a[0]);
            
            
            int[] S2 = IntArray.input(br, a[1]);
            
            
            int[] S3 = IntArray.input(br, a[2]);
            
            Solution obj = new Solution();
            int res = obj.maxEqualSum(a[0],a[1],a[2], S1, S2, S3);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int CalculateMaxSum(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
    
    public static int maxEqualSum(int N1,int N2,int N3, int[] S1, int[] S2, int[] S3) {
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        
        for (int i: S1) sum1 += i;
        for (int i: S2) sum2 += i;
        for (int i: S3) sum3 += i;
        
        int top1 = 0;
        int top2 = 0;
        int top3 = 0;
        
        int MaxSum = CalculateMaxSum(sum1, sum2, sum3);
        
        while (sum1 != sum2 || sum2 != sum3 || sum3 != sum1) {
            if (sum1 == 0 || sum2 == 0 || sum3 == 0) return 0;
            if (MaxSum == sum1) {
                sum1 -= S1[top1++];
            } else if (MaxSum == sum2) {
                sum2 -= S2[top2++];
            } else {
                sum3 -= S3[top3++];
            }
            
            MaxSum = CalculateMaxSum(sum1, sum2, sum3);
        }
        
        return sum1;
    }
}
        

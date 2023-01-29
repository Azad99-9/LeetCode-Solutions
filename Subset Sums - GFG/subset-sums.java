//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}

// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    ArrayList<Integer> ans = new ArrayList<>();
    
    void helper(ArrayList<Integer> arr, int i, int n, int sum) {
        if(i< n) {
            helper(arr, i+1, n, sum+arr.get(i));
            helper(arr, i+1, n, sum);
        } else {
            ans.add(sum);
        }
    }
    
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        int sum = 0;
        
        helper(arr, 0, N, sum);
        
        return ans;
    }
}
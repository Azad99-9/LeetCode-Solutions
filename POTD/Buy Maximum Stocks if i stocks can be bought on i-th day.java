//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            String str=br.readLine();
    		String[] starr=str.split(" ");
    		
    		//input n and d
    	    int n=Integer.parseInt(starr[0]);
    		int k= Integer.parseInt(starr[1]);
            
            starr = br.readLine().trim().split(" ");
            int[] price = new int[n];
            for(int i = 0; i < n; i++)
                price[i] = Integer.parseInt(starr[i]);
            
            Solution obj = new Solution();
            int res = obj.buyMaximumProducts(n, k, price);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int buyMaximumProducts(int n, int k, int[] price) {
        // code here
        int[][] arr = new int[n][2];
        
        for(int i = 0; i < n; i++) {
            arr[i][0] = i+1;
            arr[i][1] = price[i];
        }
        arrSort(arr, 1);
        // System.out.println(arr[0][0] + " " + arr[0][1]);
        // System.out.println(arr[1][0] + " " + arr[1][1]);
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i][1]*arr[i][0] < k) {
                count += arr[i][0];
                k -= arr[i][1]*arr[i][0];
            }else{
                int leastShares = k / arr[i][1];
                k -= arr[i][1]*leastShares;
                count += leastShares;
                break;
            }
        }
        
        return count;
    }
    public static void arrSort(int[][] arr, int col) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[col],b[col]));
    }
}
        


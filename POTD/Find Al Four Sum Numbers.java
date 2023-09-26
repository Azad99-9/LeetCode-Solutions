//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            String[] nk = br.readLine().trim().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            Solution sln = new Solution();
            ArrayList<ArrayList<Integer>> ans = sln.fourSum(a, k);
            for (ArrayList<Integer> v : ans) {
                for (int u : v) {
                    System.out.print(u + " ");
                }
                System.out.print("$");
            }
            if (ans.isEmpty()) {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// arr[] : int input array of integers
// k : the quadruple sum required



class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int n = arr.length;
        
        for (int a = 0; a < n - 3;) {
            for (int b = a + 1; b < n - 2;) {
                int c = b + 1;
                int d = n - 1;
                
                while (c < d) {
                    int sum = arr[a] + arr[b] + arr[c] + arr[d];
                    if (sum == k) {
                        ArrayList<Integer> cur = new ArrayList<>();
                        cur.add(arr[a]);
                        cur.add(arr[b]);
                        cur.add(arr[c]);
                        cur.add(arr[d]);
                        ans.add(cur);
                        c++;
                        d--;
                        while (c < d && arr[c] == arr[c-1]) c++;
                        while (d > c && arr[d] == arr[d+1]) d--;
                    } else if (sum < k) {
                        c++;
                    } else {
                        d--;
                    }
                }
                b++;
                while (b < n-2 && arr[b] == arr[b-1]) b++;
                
            }
            a++;
            while (a < n-3 && arr[a] == arr[a-1]) a++;
        }
        
        return ans;
    }
}
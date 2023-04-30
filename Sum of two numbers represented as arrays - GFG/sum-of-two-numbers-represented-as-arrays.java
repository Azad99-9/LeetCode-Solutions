//{ Driver Code Starts
//Initial Template for Java




import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int[] a = new int[n], b = new int[m];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(inputLine[i]);
            }

            ArrayList<Integer> ans = new Solution().findSum(a, b);
            for (int x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java




class Solution {
    ArrayList<Integer> findSum(int[] a, int[] b) {
        ArrayList<Integer> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int aIndex = a.length - 1;
        int bIndex = b.length - 1;
        int carry = 0;

        while (aIndex >= 0 || bIndex >= 0) {
            int curSum = carry;

            if (aIndex >= 0) curSum += a[aIndex];
            if (bIndex >= 0) curSum += b[bIndex];

            sb.append(curSum % 10);
            carry = curSum / 10;

            aIndex--;
            bIndex--;
        }

        if (carry > 0) {
            sb.append(carry);
        }

        String result = sb.reverse().toString();
        for (int i = 0; i < result.length(); i++) {
            ans.add(result.charAt(i) - '0');
        }

        return ans;
    }
}

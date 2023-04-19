//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[] nums = new int[n];
            String[] S = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minSwaps(nums);
            System.out.println(ans);
       }
    }
}
// } Driver Code Ends




class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        int[] temp = nums.clone();
        int swaps = 0;
        Arrays.sort(temp);
        Map<Integer, Integer> tracker = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            tracker.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != temp[i]) { 
                swaps++;
                int cur = nums[i];
                int tmp = nums[i];
                int correctElementIndex = tracker.get(temp[i]);
                nums[i] = nums[correctElementIndex];
                nums[correctElementIndex] = tmp;
                
                tracker.put(cur, correctElementIndex);
                tracker.put(temp[i], i);
                
            }
            
        }
        return swaps;
    }
}
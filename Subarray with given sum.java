class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        int l= 0;
        int r = 0;
        int cS = 0;
        
        while (r < n) {
            cS += arr[r];
            while (l < r && cS > s) {
                cS -= arr[l++];
            }
            if (cS == s) {
                    ArrayList<Integer> ans = new ArrayList<>();
                    ans.add(l+1);
                    ans.add(r+1);
                    return ans;
            }
            r++;
        }
        
        ArrayList<Integer> ans = new  ArrayList<>();
        ans.add(-1);
        return ans;
    }
}
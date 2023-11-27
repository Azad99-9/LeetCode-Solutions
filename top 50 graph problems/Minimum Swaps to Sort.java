class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        // duplicate nums and sort it
        // Make pairs with their indices
        // now go through the nums and find cycle length and add cyclelength - 1 to answer.
        
        int n = nums.length;
        
        int[] copy_nums = Arrays.copyOf(nums, n);
        Arrays.sort(copy_nums);
        
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            mp.put(copy_nums[i], i);
        }
        
        int ans = 0;
        boolean vis[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            
            if (vis[i] || mp.get(nums[i]) == i) continue;
            
            //find cycle length
            int cycle_len = 0;
            int j = i;
            while (!vis[j]) {
                vis[j] = true;
                j = mp.get(nums[j]);
                cycle_len++;
            }
            
            ans += cycle_len - 1;
        }
        
        return ans;
    }
}

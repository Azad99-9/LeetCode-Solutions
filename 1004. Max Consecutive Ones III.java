class Solution {
    public int longestOnes(int[] nums, int k) {
        int ct = 0;
        int max = 0; 
        int l = 0;
        int r = 0;
        int n = nums.length;
        
        while (r < n)  {
            while (r < n && ct < k+1) {
                if (nums[r] == 0) ct++;
                r++;
            }
            if (r == n) break;
            max = Math.max(r-l-1, max);
            while (ct == k+1) {
                if (nums[l++] == 0) ct--;
            }
        }

        return Math.max((ct == k+1 ? r-l-1: r-l), max);
    }
}
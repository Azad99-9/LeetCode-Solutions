class Solution {
    public int alternatingSubarray(int[] nums) {
        int n = nums.length;
        int max = -1;
        int l = 0;
        int r = 1;
        while (r < n) {
            while(r < n && nums[r] - nums[r-1] != 1) r++;
            if (r== n) return max;
            
            l = r-1;
            int prev = -1; 
            int cur = 1;
            int len = 0;
            while (r < n && ((cur == 1 && prev == -1 ) || (cur == -1 && prev == 1))) {
                r++;
                prev = cur;
                if (r < n) cur = nums[r]-nums[r-1];
            }
            max = Math.max(max, r-l);
            l = r-1;
        }
        return max;
        
    }
}
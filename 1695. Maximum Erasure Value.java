class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;

        int l = 0;
        int r = 0;
        int cs = 0;
        int max = 0;

        Set<Integer> set = new HashSet<>();

        while (r < n) {
            if (set.contains(nums[r])) {
                while (nums[l] != nums[r]) {
                    set.remove(nums[l]);
                    cs-= nums[l];
                    l++; 
                }
                set.remove(nums[l]);
                cs-= nums[l];
                l++;
            }

            set.add(nums[r]);
            cs+= nums[r];

            max = Math.max(cs, max);

            r++;

        }

        return max;
    }
}
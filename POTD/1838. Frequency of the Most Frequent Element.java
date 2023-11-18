lass Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int maxi = 0;
        long cs = 0;
        // System.out.println(Arrays.toString(nums));
        for (int l = 0, r = 0; r < n; r++) {
            cs += nums[r];

            while (cs + k < (long)(nums[r] * (r - l + 1))) {
                cs -= nums[l];
                l++;
            }

            maxi = Math.max(r-l+1, maxi);
        }
        return maxi;
    }
}

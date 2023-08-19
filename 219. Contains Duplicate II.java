public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();

        if (n <= k) {
            for (int i = 0; i < n; i++) {
                if (set.contains(nums[i])) return true;
                else set.add(nums[i]);
            }
        } else {
            for (int i = 0; i <= k; i++) {
                if (set.contains(nums[i])) return true;
                else set.add(nums[i]);
            }
            int l = 0;
            int r = k;
            while (r < n) {
                if (++r < n) {
                    set.remove(nums[l++]);
                    if (set.contains(nums[r])) return true;
                    else set.add(nums[r]);
                }
            }
        }
        return false;
    }
}
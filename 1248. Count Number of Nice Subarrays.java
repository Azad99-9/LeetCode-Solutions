class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        Map<Integer, Integer> prefixSums = new HashMap<>();
        int n = nums.length;
        int cSum = 0;
        int ans = 0;
        prefixSums.put(0, 1);

        for (int i = 0; i < n; i++) {
            cSum += (nums[i] & 1);

            int x = cSum - k;
            if (prefixSums.containsKey(x)) {
                ans += prefixSums.get(x);
            }

            if (prefixSums.containsKey(cSum)) {
                int freq = prefixSums.get(cSum);
                prefixSums.put(cSum, freq+1);
            } else {
                prefixSums.put(cSum, 1);
            }
        }

        return ans;

    }
}
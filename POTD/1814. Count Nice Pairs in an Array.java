class Solution {
    private static int rev(int n) {
        int ans = 0;
        while (n != 0) {
            int r = n % 10;
            n = n / 10;
            ans = (ans * 10) + r;
        }
        return ans;
    }
    public int countNicePairs(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] - rev(nums[i]);
        }

        Map<Integer, Integer> mp = new HashMap<>();
        long ans = 0;
        for (int i = nums.length - 1; i > -1; i--) {
            int cur = 0;
            if (mp.containsKey(nums[i])) cur = mp.get(nums[i]);
            ans += cur;
            mp.put(nums[i], cur + 1);
        }

        return (int)(ans % ((int)1e9 + 7));
    }
}

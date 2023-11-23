class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans = new ArrayList<>();
        for (int i = 0; i < l.length; i++) {
            ans.add(check(l[i], r[i], nums));
        }

        return ans;
    }

    private boolean check(int l, int r, int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = l; i <= r; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }

        if ((max - min) % (r - l) != 0) return false;

        int diff = (max - min) / (r - l);

        if (diff == 0) return true;

        boolean[] vis = new boolean[r-l+1];

        for (int i = l; i <= r; i++) {
            if ((nums[i] - min) % diff != 0) return false;
            else {
                int pos = (nums[i] - min) / diff;
                if (vis[pos]) return false;
                else vis[pos] = true;
            }
        }

        return true;
    }
}

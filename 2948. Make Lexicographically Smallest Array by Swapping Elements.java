class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;
        int[][] n2 = new int[n][2];
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            n2[i][0] = i;
            n2[i][1] = nums[i];
        }

        Arrays.sort(n2, (a, b) -> a[1] - b[1]);
        ArrayList<ArrayList<Integer>> groups = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i == 0 || n2[i][1] - n2[i-1][1] > limit) {
                groups.add(new ArrayList<>());
            }
            groups.get(groups.size() - 1).add(n2[i][0]);
        }

        for (int i = 0; i < groups.size(); i++) {
            ArrayList<Integer> actual = groups.get(i);
            ArrayList<Integer> sorted = new ArrayList<>(groups.get(i));
            Collections.sort(sorted);
            for (int j = 0; j < actual.size(); j++) {
                ans[sorted.get(j)] = nums[actual.get(j)];
            }
        }   

        return ans;
    }
}

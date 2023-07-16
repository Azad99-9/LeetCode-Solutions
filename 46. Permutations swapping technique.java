class Solution {
    public void swap (int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void recur( int i, int[] nums, int n,  List<List<Integer>> ans) {
        if (i == n) {
            List<Integer> temp = new ArrayList<>();
            for (int num : nums) {
                temp.add(num);
            }
            ans.add(temp);
            return;
        }

        for (int j = i; j < n; j++) {
            swap(j, i, nums);
            recur(i+1, nums, n, ans);
            swap(j, i, nums);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new LinkedList<>();
        recur(0, nums, nums.length, ans);
        return ans;
    }
}
class Solution {
    Set<List<Integer>> ans = new HashSet<>();

    public void helper(int[] nums, int i, int n, List<Integer> temp){
        if(i< n) {
            List<Integer> temp2 = new LinkedList<>(temp);
            temp2.add(nums[i]);
            helper(nums, i+1, n, temp2);
            helper(nums, i+1, n, temp);
        } else {
            ans.add(temp);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        LinkedList<Integer> temp = new LinkedList<>();

        Arrays.sort(nums);

        helper(nums, 0, nums.length, temp);

        List<List<Integer>> ans1 = new ArrayList<>();
        ans1.addAll(ans);

        return ans1;
    }
}

//T-O(2^t * k)
//s-O(k^x)

class Solution {
    public void helper(int i, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
        if(i == arr.length) {
            if(target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[i] <= target) {
            ds.add(arr[i]);
            helper(i, arr, target-arr[i], ans, ds);
            ds.remove(ds.size()-1);
        }
        helper(i+1, arr, target, ans, ds);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        helper(0, candidates, target, ans, new LinkedList<>());

        return ans;
    }
}

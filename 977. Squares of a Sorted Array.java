class Solution {
    private void swap(int[] arr, int a, int b) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
    public int[] sortedSquares(int[] nums) {
       int[] ans = new int[nums.length];

       for (int i = 0; i < nums.length; i++) {
           nums[i] = nums[i]*nums[i];
       }

       int l = 0;
       int r = nums.length - 1;

       int index = nums.length - 1;
       while (l <= r) {
           while (l <= r && nums[l] >= nums[r]) {
               ans[index--] = nums[l++];
           }
           while (l <= r && nums[r] > nums[l]) {
               ans[index--] = nums[r--];
           }
       }

       return ans;
    }
}
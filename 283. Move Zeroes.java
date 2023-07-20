class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        int n = nums.length;
        while (j < n) {
            if (nums[j] == 0) j++;
            else {
                nums[i] = nums[j];
                i++; j++;
            }
        }
        for (int l = i; l < n; l++) nums[l] = 0;
    }
}
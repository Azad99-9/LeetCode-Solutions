class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        int[] aux = new int[k];
        int n = nums.length-1;
        for (int i = k-1; i > -1; i--) {
            aux[i] = nums[n--];
        }
        n = nums.length;
        for (int i = (n-k-1); i > -1; i--) {
            nums[i+k] = nums[i];
        }
        for (int i = 0; i < k; i++) {
            nums[i] = aux[i];
        }
    }
}
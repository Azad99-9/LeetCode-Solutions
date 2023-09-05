class Solution {
    public void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;

        while (mid <= high) {
            switch(nums[mid]) {
                case 0: 
                    swap(nums, low++, mid++);
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(nums, high--, mid);
                    break;
            }
        }
    }
}
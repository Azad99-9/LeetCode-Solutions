class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int l = 0;
        int h = n - 1;
        while (l <= h) {
            int mid = (l + h) / 2;
            System.out.println(mid);
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) h = mid - 1;
            else l = mid + 1;
        }
        
        if (l == n || nums[l] > target) return l;
        else return l + 1;
    }
}
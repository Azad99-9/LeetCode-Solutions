class Solution {
    public int search(int[] nums, int target) {
        //T-O(logn)
        //S-O(1)
        int low = 0;
        int high = nums.length-1;
        while(low<=high) {
            int mid = (low+high)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[low]<= nums[mid])
                if(nums[low] <= target && nums[mid] >= target)
                    high = mid-1;
                else
                    low = mid+1;
            else
                 if(nums[mid] <= target && target <= nums[high])
                    low = mid+1;
                else
                    high = mid-1;
        }
        return -1;
    }
}

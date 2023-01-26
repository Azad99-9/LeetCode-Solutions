// T-O(n)
// S-O(1)

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int temp = 0;
        int max = 0;
        for(int i= 0; i< nums.length; i++) {
            if(nums[i] == 1) temp++;
            else {
                max = Math.max(temp,max);
                temp = 0;
            }
        }
        max = Math.max(temp,max);
        return max;
    }
}

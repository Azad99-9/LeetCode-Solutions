class Solution {

    public int maxSubArray(int[] nums) {

        int sum = 0;
        int MaxSum = nums[0];
        int i = 0;
        while(i<nums.length){

            sum+=nums[i];
            if(sum < nums[i]) sum = nums[i];
            if(MaxSum < sum) MaxSum = sum;
            i++;

        }

        return MaxSum;

    }
}
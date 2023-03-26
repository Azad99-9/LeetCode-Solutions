class Solution {
    public int[] productExceptSelf(int[] nums) {
     int totalProd = 1;
     int zeroCount = 0;
     for (int num : nums) {
         if (num == 0) zeroCount += 1;
         else totalProd *= num;
     }
     for (int i = 0; i < nums.length; i++) {
         if (nums[i] == 0 && zeroCount < 2) nums[i] = totalProd;
         else if (nums[i] != 0 && zeroCount > 0) nums[i] = 0;
         else if (zeroCount == 0) nums[i] = totalProd / nums[i];
         else nums[i] = 0;
     }
     return nums;
    }
}

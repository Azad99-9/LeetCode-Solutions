// T - O(n)
// S - O(1)

class Solution {
    public int removeDuplicates(int[] nums) {
     int k = 1;
     int u = 0;
     int d = u+1;

     while(d<nums.length) {
         if(nums[u] == nums[d]) d++;
         else {
             u++; k++;
             nums[u] = nums[d];
             d++;
         }
     }

     return k;
    }
}

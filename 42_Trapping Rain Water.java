// T-O(n)
// s-O(1)

class Solution {
    public int trap(int[] height) {
        int low = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int ans = 0;

        while( low <= right ) {
            if( height[low] <= height[right] ) {
                if( height[low] > leftMax ) leftMax = height[low];
                else ans+= leftMax - height[low];
                low++;
            }else {
                if( height[right] > rightMax ) rightMax = height[right];
                else ans+= rightMax - height[right];
                right--;
            }
        }

        return ans;
    }
}

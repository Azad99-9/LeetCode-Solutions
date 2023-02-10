class Solution {

//T-O(n)
//S-O(1)

    public int maxArea(int[] height) {
        int max = 0;
        int low = 0; int high = height.length - 1;
        while(low < high) {
            max = Math.max(max, (high - low) * Math.min(height[high], height[low]));
            if(height[high] < height[low])
                high--;
            else
                low++;
            
            }
            return max;
        }

    }


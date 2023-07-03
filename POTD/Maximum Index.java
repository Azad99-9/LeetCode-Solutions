class Solution {

    int maxIndexDiff(int arr[], int n) {
        int[] fromleftMin = new int[n];
        int[] fromrightMax = new int[n];
        fromleftMin[0] = arr[0];
        fromrightMax[n-1] = arr[n-1];
        for (int i = 1; i < n; i++) {
            fromleftMin[i] = Math.min(fromleftMin[i-1], arr[i]);
        }
        // System.out.println();
        for (int i = n-2; i > -1; i--) {
            fromrightMax[i] = Math.max(fromrightMax[i+1], arr[i]);
            // System.out.print(fromrightMax[i]);
        }
        
        int i = 0; int j = 0;
        int ans = 0;
        while (i < n && j < n) {
            if (fromleftMin[i] <= fromrightMax[j]) {
                ans = Math.max(j-i, ans);
                j++;
            } else {
                i++;
            }
        }
        return ans;
    }
}
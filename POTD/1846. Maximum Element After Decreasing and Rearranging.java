class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);

        arr[0] = 1;
        int maxi = 1;
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            if (Math.abs(arr[i-1]-arr[i]) > 1) arr[i] = arr[i-1] + 1;
            maxi = Math.max(maxi, arr[i]);
        }

        return maxi;
    }
}

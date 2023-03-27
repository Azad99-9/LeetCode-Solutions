class Solution {
    public int findMin(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int min = arr[0];
        while (low <= high) {
            if (arr[low] <= arr[high]) {
                min = Math.min(arr[low], min);
                break;
            }
            int mid = (low + high) / 2;
            min = Math.min(min, arr[mid]);
            if (arr[low] <= arr[mid]) low = mid + 1;
            else high = mid - 1;
        }
        return min;
    }
}

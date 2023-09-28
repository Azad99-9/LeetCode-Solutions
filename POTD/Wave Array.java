class Solution {
    public static void convertToWave(int n, int[] arr) {
        for (int i = 1; i < n; i+=2) {
            int tmp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = tmp;
        }
    }
}
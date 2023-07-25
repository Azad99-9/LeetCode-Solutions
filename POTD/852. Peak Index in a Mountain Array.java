class Solution {
    public int peakIndexInMountainArray(int[] a) {
        int l = 0;
        int r = a.length - 1;
        int mid = (l+r)/2;
        while (l <= r) {
            if (a[l] < a[mid] && a[r] < a[mid]
            && a[mid-1] < a[mid] && a[mid+1] < a[mid]) return mid;

            else if (a[l] > a[mid]) r = mid;
            else if (a[r] > a[mid]) l = mid;
            else if (a[mid-1] > a[mid]) r = mid;
            else if (a[mid+1] > a[mid]) l = mid;
            mid = (l+r)/2; 
        }

        return mid;
    }
}
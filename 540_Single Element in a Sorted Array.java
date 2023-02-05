class Solution {
    public int singleNonDuplicate(int[] arr) {
        //T-O(logn)
        //S-O(1)
        int low = 0;
        int high = arr.length-1;
        while(low < high) {
            int mid = (low+high)/2;
            if(mid%2 != 0 && arr[mid-1] != arr[mid]) // if odd check left side
                high = mid;
            else if(mid%2 == 0 && arr[mid+1] != arr[mid]) // if even check right side
                high = mid;
            else low = mid+1;
        }
        return arr[low];
    }
}

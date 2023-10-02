class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        int n = arr.length;
        int l = 0;
        int h = n - 1;
        List<Integer> ans = new ArrayList<>();
        int mid = 0;

        while (l < h) {
            mid = l + (h-l) / 2;

            if (arr[mid] >= x) h = mid;
            else l = mid + 1;
        }
        l = h - 1;

        while(k != 0) {
                if ( k != 0 && l >= 0 && h < n) {
                    int diff1 = Math.abs(arr[l] - x);
                    int diff2 = Math.abs(arr[h] - x);
                    if (diff1 <= diff2) {
                        l--;
                    }
                    else h++;
                    k--;
                }
                else if (k != 0 && l >= 0) {
                    l--;
                    k--;
                }
                else if (k != 0 && h < n) {
                    h++;
                    k--;
                }
        }

        l++;
        while (l < h) {
            ans.add(arr[l++]);
        }

        return ans;
    }
}
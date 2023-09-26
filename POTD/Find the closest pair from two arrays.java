class Solution{
    // Function for finding maximum and value pair
    public static ArrayList<Integer> printClosest (int arr[], int brr[], int n, int m, int x) {
        int l = 0;
        int h = m - 1;
        // Arrays.sort(arr);
        // Arrays.sort(brr);
        
        int diff = Integer.MAX_VALUE;
        int p = 0;
        int q = 0;
        
        while (l < n && h >= 0) {
            int cs = arr[l] + brr[h];
            int curdiff = Math.abs(x - cs);
    
            if (diff > curdiff) {
                p = arr[l];
                q = brr[h];
                diff = curdiff;
            }
            if (cs > x) {
                h--;
            } else {
                l++;
            }
            
        }
        
        return new ArrayList<>(List.of(p, q));
    }
}
class Solution {
    private double curSum (int m, int[] arr) {
        double ans = 0;
        for (int i = 0; i < arr.length-1; i++) {
            ans += Math.ceil(arr[i] / (double)m);
        }
        if (arr.length - 1 >  -1) ans +=  arr[arr.length - 1]/(double)m;
        System.out.println(ans);
        return ans;
    }
    public int minSpeedOnTime(int[] dist, double hour) {
        int h = (int)1e9;
        
        int l = 1;
        int min = Integer.MAX_VALUE;
        while (l <= h) {
            int mid = (l+h)/2;
            double cS = curSum(mid, dist);
            if (hour < cS) l = mid + 1;
            else h = mid - 1;
            if (cS <= hour) min = Math.min(mid, min);
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        Collections.sort(a);
        int l = 0;
        int h = m-1;
        int ans = Integer.MAX_VALUE;
        while (h < n) {
            ans = Math.min(a.get(h)-a.get(l), ans);
            l++; h++;
        }
        return ans;
    }
}
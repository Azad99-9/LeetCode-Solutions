class Solution{
    private void recur(int n, List<Integer> ans) {
        if (n <= 0) {
            ans.add(n);
            return;
        }
        
        ans.add(n);
        recur(n-5, ans);
        ans.add(n);
    }
    public List<Integer> pattern(int n){
        List<Integer> ans = new ArrayList<>();
        
        recur(n, ans);
        return ans;
    }
}

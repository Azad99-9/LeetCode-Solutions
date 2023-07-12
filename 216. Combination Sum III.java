class Solution {
    public void recur(int i, int cs, int t, int k,  List<List<Integer>> ans, List<Integer> cL, int n) {
        if (cs == t && k == 0) {
            ans.add(new LinkedList<>(cL));
            return;
        }
        if (k == 0 || cs > t) return ;
        if (i == n) return;

        cL.add(i);
        recur(i+1, cs+i, t, k-1, ans, cL,  n);
        cL.remove(cL.size()  - 1);
        recur(i+1, cs, t, k, ans, cL, n);

        return;

    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new LinkedList<>();
        recur(1, 0, n, k, ans, new LinkedList<>(), 10);
        return ans;
    }
}
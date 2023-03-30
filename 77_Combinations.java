class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public void picker(int[] base, List<Integer> subList, int k, int i, int n) {
        if (subList.size() == k) { 
            ans.add(subList);
            return;
        }
        if (i >= n) return;
        List<Integer> niu = new ArrayList<>(subList);
        niu.add(base[i]);
        picker(base, niu, k, i+1, n);
        picker(base, subList, k, i+1, n);
        return;
    }
    public List<List<Integer>> combine(int n, int k) {
        int[] range = new int[n];
        for (int i = 1; i <= n; i++) range[i - 1] = i;
        List<Integer> subList = new ArrayList<>();
        picker(range,subList, k, 0, n);
        return ans;
    }
}

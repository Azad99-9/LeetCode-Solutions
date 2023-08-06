class Solution
{
    private void swap (char[] s, int i, int j) {
        char tmp = s[i];
        s[i] = s[j];
        s[j] = tmp;
    }
    private void recursion(char[] s, int l, int r, ArrayList<String> ans) {
        if (l == r) ans.add(String.valueOf(s));
        
        for (int i = l ; i <= r; i++) {
            swap(s, l, i);
            recursion(s, l+1, r, ans);
            swap(s, l, i);
        }
    }
    public ArrayList<String> permutation(String S)
    {
        ArrayList<String> ans = new ArrayList<>();
        recursion(S.toCharArray(), 0, S.length() - 1, ans);
        Collections.sort(ans);
        return ans;
    }
	   
}

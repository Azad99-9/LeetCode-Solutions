class Solution {
    private void recur(int open, int close, int n, StringBuilder s, List<String> ans) {
        if (open == close && n == 0) {
            ans.add(s.toString());
            return;
        }

        if (open < close || n < 0) return;

        s.append('(');
        recur(open + 1, close, n-1, s, ans);
        s.deleteCharAt(s.length() - 1);

        s.append(')');
        recur(open, close + 1, n, s, ans);
        s.deleteCharAt(s.length() - 1);
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        recur(0, 0, n, new StringBuilder(), ans);
        return ans;
    }  
}
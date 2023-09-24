class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stk = new Stack<>();
        stk.push(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            if (!stk.isEmpty() && s.charAt(i) == stk.peek()) stk.pop(); 
            else stk.push(s.charAt(i));
        }

        Collections.reverse(stk);

        StringBuilder ans = new StringBuilder();
        while (!stk.isEmpty()) {
            ans.append(String.valueOf(stk.pop()));
        }

        return ans.toString();
    }
}
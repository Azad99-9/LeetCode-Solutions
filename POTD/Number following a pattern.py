class Solution{
    static String printMinNumberForPattern(String S){
        Stack<Character> stk = new Stack<>();
        
        char count = '1';
        
        StringBuilder ans = new StringBuilder();
        
        for (int i = 0; i < S.length(); i++) {
            stk.push(count);
            count += 1;
            if (S.charAt(i) == 'I') {
                while (!stk.isEmpty()) {
                    ans.append(String.valueOf(stk.pop()));
                }
            }
        }
        stk.push(count);
        while (!stk.isEmpty()) {
            ans.append(String.valueOf(stk.pop()));
        }
        return ans.toString();
    }
}

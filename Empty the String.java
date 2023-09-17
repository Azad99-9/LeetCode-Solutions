class Solution {
    static int makeStringEmpty(String str) {
        Stack<Character> stk = new Stack<>();
        
        int max = 0;
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (stk.isEmpty()) {
                 max += cnt;
                 cnt = 0;
            }
            stk.push(str.charAt(i));
            // System.out.println(stk);
            if (stk.peek() == 'k') {
                StringBuilder curWord = new StringBuilder();
                int l = 0;
                for (; l < 4 && !stk.isEmpty(); l++) {
                    curWord.append(String.valueOf(stk.pop()));
                }
                // System.out.println(curWord);
                if (curWord.toString().equals("keeg")) cnt++;
                else return -1;
            }
        }
        if (stk.isEmpty()) max += cnt;
        if (max == 0) return -1;
        return max;
    }
};
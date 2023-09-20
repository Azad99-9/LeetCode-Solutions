class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stk = new Stack<>();
        for (String s : tokens) {
            if (s.equals("+")) {
                int a = Integer.valueOf(stk.pop());
                int b = Integer.valueOf(stk.pop());
                stk.push(String.valueOf(a+b));
            } else if (s.equals("-")) {
                int a = Integer.valueOf(stk.pop());
                int b = Integer.valueOf(stk.pop());
                stk.push(String.valueOf(b - a));
            } else if (s.equals("*")) {
                int a = Integer.valueOf(stk.pop());
                int b = Integer.valueOf(stk.pop());
                stk.push(String.valueOf(a*b));
            } else if (s.equals("/")) {
                int a = Integer.valueOf(stk.pop());
                int b = Integer.valueOf(stk.pop());
                stk.push(String.valueOf(b / a));
            } else {
                stk.push(s);
            }
        }
        // System.out.println(stk);
        return Integer.valueOf(stk.pop());
    }
}
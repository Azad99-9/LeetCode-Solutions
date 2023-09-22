class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> stk = new Stack<>();
        int[] ans = new int[n];

        for (int i = n - 1; i > -1; i--) {
            while (!stk.isEmpty() && temperatures[stk.peek()] <= temperatures[i]) stk.pop();
            if (stk.isEmpty()) ans[i] = 0;
            else ans[i] = Math.abs(i - stk.peek());
            stk.push(i);
        }

        return ans;
    }
}
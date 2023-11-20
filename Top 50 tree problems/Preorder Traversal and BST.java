class Solution {
    static int canRepresentBST(int arr[], int N) {
        Stack<Integer> stk = new Stack<>();
        int root = Integer.MIN_VALUE;
        
        for (int i = 0; i < N; i++) {
            if (arr[i] < root) return 0;
            while(!stk.isEmpty() && stk.peek() < arr[i]) {
                root = stk.pop();
            }
            stk.push(arr[i]);
        }
        
        return 1;
    }
}

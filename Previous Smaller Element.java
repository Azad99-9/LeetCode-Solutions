public class Solution {
	//T-O(n)
	//S-O(n)
    public int[] prevSmaller(int[] A) {
        Stack<Integer> stk= new Stack<>();
        int[] ans = new int[A.length];
        
        for(int i= 0; i< A.length; i++) {
            while(!stk.isEmpty() && stk.peek() >= A[i])
                stk.pop();
            if(stk.isEmpty())
                ans[i] = -1;
            else
                ans[i] = stk.peek();
            stk.push(A[i]);
        }
        
        return ans;
    }
}


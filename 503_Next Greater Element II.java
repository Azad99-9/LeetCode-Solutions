class Solution {
	//T_O(N)
	//S_O(N)

    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> aux = new Stack<>();
        int n= nums.length;
        int[] ans = new int[n];

        for(int i = 2*n-1; i> -1; i--) {
            while(!aux.isEmpty() && aux.peek() <= nums[i%n])
                aux.pop();
            if(i < n) {
                if(!aux.isEmpty())
                    ans[i] = aux.peek();
                else
                    ans[i] = -1;
            }
            aux.push(nums[i%n]);
        }
        return ans;
    }
}

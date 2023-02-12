class Solution {
    //T-O(N)+O(N)
    //S-O(n)
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n-k+1];
        int ri= 0;
        //to Store index
        Deque<Integer> q = new ArrayDeque<>();
        for(int i= 0; i< n; i++) {
            //remove numbers out of range
            if(!q.isEmpty() && q.peek() == i-k)
                q.poll();
            //remove smaller numbers in k range as they are useless
            while(!q.isEmpty() && nums[q.peekLast()] < nums[i])
                q.pollLast();

            q.offer(i);
            if(i >= k-1)
                ans[ri++] = nums[q.peek()];
        }
        return ans;
    }
}

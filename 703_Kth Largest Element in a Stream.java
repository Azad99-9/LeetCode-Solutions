class KthLargest {
    PriorityQueue<Integer> helper = new PriorityQueue<>();
    int size;
    public KthLargest(int k, int[] nums) {
        size = k;
        for(int i = 0; i < nums.length; i++) {
            helper.offer(nums[i]);
            if(helper.size() > k) helper.poll();
        }
    }
    
    public int add(int val) {
    	// T - klogk
    	// S - k
        helper.offer(val);
        if(helper.size() > size) helper.poll();
        return helper.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */

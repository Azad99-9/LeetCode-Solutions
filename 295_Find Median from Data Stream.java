class MedianFinder {
    //S-O(n)
    PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer> minHeap;
    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>((a,b) -> b-a);
    }
    
    public void addNum(int num) {
    	//T-O(logn)
        if(minHeap.isEmpty() && maxHeap.isEmpty())
            maxHeap.offer(num);
        else {
            if(maxHeap.peek() < num)
                minHeap.offer(num);
            else
                maxHeap.offer(num);
        }

        int n= maxHeap.size();
        int m= minHeap.size();

        if(n-m == 2 || n-m == -2) {
            if(n>m) {
                int element = maxHeap.poll();
                minHeap.offer(element);
            } else {
                int element = minHeap.poll();
                maxHeap.offer(element);
            }
        }
    }
    
    public double findMedian() {
    	//T-O(1)
        int n= maxHeap.size();
        int m= minHeap.size();

        if((n+m) % 2 == 0) 
            return (minHeap.peek()+maxHeap.peek())/2.0;
        if(n>m) 
            return maxHeap.peek();
        return minHeap.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */

class MyStack {

    //T-O(n)
    //S-O(n)

    Queue<Integer> q1;

    public MyStack() {
        q1 = new LinkedList<>();
    }
    
    public void push(int x) {
        q1.offer(x);
        for(int i= 0; i< q1.size()-1; i++)
            q1.offer(q1.poll());
    }
    
    public int pop() {
        if(q1.peek() == null)
            return -1;
        return q1.poll();
    }
    
    public int top() {
        if(q1.peek() == null)
            return -1;
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

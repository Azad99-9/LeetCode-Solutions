class GfG{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q){
        Stack<Integer> rev = new Stack<>();
        
        int n = q.size();
        for (int i = 0; i < n; i++) {
            rev.push(q.poll());
        }
        for (int i = 0; i < n; i++) {
            q.offer(rev.pop());
        }
        
        return q;
    }
}
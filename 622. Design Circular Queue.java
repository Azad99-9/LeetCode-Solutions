class MyCircularQueue {
    int[] q;
    int f = 0;
    int r = 0;
    int k = 0;
    public MyCircularQueue(int k) {
        q = new int[k];
        q[0] = -1; 
        this.k = k;
    }
    
    public boolean enQueue(int value) {
        if (isFull()) return false;
        q[r] = value;
        r = (r + 1) % k;
        return true;
    }
    
    public boolean deQueue() {
        if (isEmpty()) return false;
        f = (f + 1) % k;
        if (f == r) q[f] = -1;
        return true;
    }
    
    public int Front() {
        if (isEmpty()) return -1;
        return q[f];
    }
    
    public int Rear() {
        if (isEmpty()) return -1;
        int i = r - 1;
        if ( i < 0 ) i = k - 1;
        return q[i];
    }
    
    public boolean isEmpty() {
        return (f == r && q[f] < 0);
    }
    
    public boolean isFull() {
        return (f == r && q[f] >= 0);
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
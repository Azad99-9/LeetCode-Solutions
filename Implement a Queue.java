import java.util.* ;
import java.io.*; 
public class Queue {

    int[] q = new int[5000];
    int first = -1;
    int last = -1;

    Queue() {
    }

    /*----------------- Public Functions of Queue -----------------*/

    boolean isEmpty() {
        if(first == -1 && last == -1)
            return true;
        if(first > last) {
            first = -1;
            last = -1;
            return true;
        }
        else
            return false;
    }

    void enqueue(int data) {
        if(!isFull()) {
            if(isEmpty()) {
                first++;
                last++;
                q[last] = data;
                return;
            }
            last++;
            q[last] = data;
        }
    }

    int dequeue() {
        if(isEmpty())
            return -1;
        else {
            int temp = q[first];
            first++;
            isEmpty();
            return temp;
        }
    }

    int front() {
        if(!isEmpty()) {
            return q[first];
        }
        return -1;
    }

    boolean isFull() {
        if(last+1 < q.length)
            return false;
        else
            return true;
    }

}


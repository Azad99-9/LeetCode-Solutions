import java.util.* ;
import java.io.*; 

public class Stack {

    int[] stk;
    int top;

    Stack(int n) {
        stk = new int[n];
        top = -1;
    }
    void push(int num) {
        top++;
        if(isFull() == 0) {
            stk[top] = num;
            return;
        }
        top--;
    }
    int pop() {
        if(isEmpty() == 1)
            return -1;
        else {
            int temp = stk[top];
            top--;
            return temp;
        }
    }
    int top() {
        if(isEmpty() == 1)
            return -1;
        else
            return stk[top];
    }
    int isEmpty() {
        if(top > -1)
            return 0;
        else
            return 1;
    }
    int isFull() {
        if(top < stk.length)
            return 0;
        else
            return 1;
    }
}


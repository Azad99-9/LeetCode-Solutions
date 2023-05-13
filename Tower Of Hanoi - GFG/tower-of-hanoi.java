//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();//total testcases
        while (T-- > 0) {
            Hanoi obj = new Hanoi();
            int N;
            
            //taking input N
            N = sc.nextInt();

            //calling toh() method 
            System.out.println(obj.toh(N, 1, 3, 2));
        }
    }
}






// } Driver Code Ends


// User function Template for Java


// avoid space at the starting of the string in "move disk....."
class Hanoi {
    long moves = 0;
    void towerOfHanoi(int N, int from, int to, int helper, long moves) {
        if (N == 1) {
            System.out.println("move disk 1 from rod "+ from + " to rod " + to);
            this.moves++;
            return;
        }
        towerOfHanoi(N-1, from, helper, to, moves);
        
        this.moves++;
        
        System.out.println("move disk "+ N +" from rod "+ from + " to rod " + to);
        towerOfHanoi(N-1, helper, to, from, moves);
        
        
    }
    public long toh(int N, int from, int to, int helper) {
        towerOfHanoi(N, from, to, helper, moves);
        return this.moves;
    }
}

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M,N));
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java


class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    boolean knows(int M[][], int a, int b) {
        if(M[a][b] == 1)
            return true;
        return false;
    }
    int celebrity(int M[][], int n)
    {
    	Stack<Integer> people = new Stack<>();
    	for(int i= 0; i< n; i++)
    	    people.push(i);
    	while(people.size() > 1) {
    	    int p1 = people.pop();
    	    int p2 = people.pop();
    	    if(knows(M,p1,p2))
    	        people.push(p2);
    	    else
    	        people.push(p1);
    	}
    	
    	int tempCeleb = people.pop();
    	boolean knowsSomeOne = false;
    	boolean everyOneknows = true;
    	for(int i= 0; i< n; i++) {
    	    knowsSomeOne = knows(M,tempCeleb, i);
    	    if(knowsSomeOne) return -1;
    	}
    	for(int i= 0; i< n; i++) {
    	    if(i!=tempCeleb) {
    	        everyOneknows = knows(M,i, tempCeleb);
    	        if(!everyOneknows) return -1;
    	    }
    	}
    	return tempCeleb;
    }
}
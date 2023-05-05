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
    int celebrity(int M[][], int n)
    {
        Stack<Integer> people = new Stack<>();
        
        for (int person = 0; person < n; person++) people.push(person);
        
        while (people.size() != 1) {
            int person1 = people.pop();
            int person2 = people.peek();
            if (M[person1][person2] == 1) continue;
            else {
                people.pop();
                people.push(person1);
            }
        }
        
        int celeb = people.peek();
        for (int i = 0; i < n; i++) {
            if (M[celeb][i] == 1) return -1;
            if (M[i][celeb] == 0) 
                if (i != celeb) return -1;
        }
        
        return celeb;
    }
}
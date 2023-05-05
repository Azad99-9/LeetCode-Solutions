//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String A = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution
{
    public String FirstNonRepeating(String A)
    {
        StringBuilder ans = new StringBuilder();
        HashMap<Character, Integer> track = new HashMap<>();
        Queue<Character> q = new LinkedList<>(); 
        char[] a = A.toCharArray();
        
        for(char ch: a) {
            if (!track.containsKey(ch)) { 
                q.offer(ch);
                track.put(ch, 1);
            }
            else {
                track.put(ch, track.get(ch) + 1);
            }
            
            while (!q.isEmpty()) {
                if (track.get(q.peek()) == 1) {
                    break;
                } else {
                    q.poll();
                }
            }
            
            if (q.isEmpty()) ans.append('#');
            else ans.append(q.peek());
        }
        
        return ans.toString();
    }
}
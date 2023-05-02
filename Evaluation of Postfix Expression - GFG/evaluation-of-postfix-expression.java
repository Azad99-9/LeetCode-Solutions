//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    System.out.println(new Solution().evaluatePostFix(br.readLine().trim()));
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to evaluate a postfix expression.
    public static int performCalculation (int a, int b, char op) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
        }
        return 0;
    }
    
    public static int evaluatePostFix(String s)
    {
        Stack<Integer> stk = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*' || s.charAt(i) == '/' || s.charAt(i) == '+' || s.charAt(i) == '-') {
                int b = stk.pop();
                int a = stk.pop();
                int res = performCalculation(a, b, s.charAt(i));
                stk.push(res);
                
            } else {
                stk.push(s.charAt(i)-'0');
            }
        }
        
        return stk.pop();
    }
}
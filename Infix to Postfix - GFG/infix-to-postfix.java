//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            System.out.println(
                new Solution().infixToPostfix(br.readLine().trim()));
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String exp) {
    HashMap<Character, Integer> precedence = new HashMap<Character, Integer>();
    precedence.put('+', 1);
    precedence.put('-', 1);
    precedence.put('*', 2);
    precedence.put('/', 2);
    precedence.put('^', 3);

    Stack<Character> stk = new Stack<>();
    StringBuilder postFix = new StringBuilder();
    
    int i = 0;
    while (i < exp.length()) {
        Character ch = exp.charAt(i);
        if (ch != '+' && ch != '-' && ch != '*' && ch != '/' && ch != '^' && ch != ')' && ch != '(') 
            postFix.append(ch);
        else if (ch == '(') stk.push('(');
        else if (ch == ')') {
            while (!stk.isEmpty() && stk.peek() != '(') postFix.append(stk.pop());
            stk.pop();
        }
        else {
            while (!stk.isEmpty() && precedence.containsKey(stk.peek()) && precedence.get(ch) <= precedence.get(stk.peek())) {
                    postFix.append(stk.pop());
            }
            stk.push(ch);
        }
        i++;
    }
    
    while (!stk.isEmpty()) postFix.append(stk.pop());
    
    return postFix.toString();
}

}
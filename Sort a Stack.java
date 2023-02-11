import java.util.* ;
import java.io.*; 
public class Solution {

	//T-O(n)
	//s-O(n)

	public static void insertCorrectPos(int x, Stack<Integer> s) {
		if(s.size() == 0 || s.peek() < x)
			s.push(x);
		else {
			int a = s.pop();
			insertCorrectPos(x, s);
			s.push(a);
		}
	}

	public static void reverse(Stack<Integer> s) {
		if(s.size() > 0) {
			int x = s.pop();
			reverse(s);
			insertCorrectPos(x, s);
		}
	}

	public static void sortStack(Stack<Integer> stack) {
		reverse(stack);
	}

}

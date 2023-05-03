//{ Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SpeStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			Stack<Integer> s=new Stack<>();
			GfG g=new GfG();
			while(!g.isEmpty(s)){
			    g.pop(s);
			}
			while(!g.isFull(s,n)){
				g.push(sc.nextInt(),s);
			}
		System.out.println(g.min(s));
		}
	}
}
// } Driver Code Ends


/*Complete the function(s) below*/
class GfG{
    int dummy = (int)Math.pow(10, 5);
    int min = -1;
	public void push(int a,Stack<Integer> s)
	{
	    int curMin = a;
	    if (min != -1) curMin = Math.min(min, curMin);
	    min = curMin;
	    s.push((a*dummy)+min);
	}
	public int pop(Stack<Integer> s)
    {
        return s.pop() / dummy;
	}
	public int min(Stack<Integer> s)
        {
           return s.peek()%dummy;
	}
	public boolean isFull(Stack<Integer>s, int n)
        {
           if (s.size() == n) return true;
           return false;
	}
	public boolean isEmpty(Stack<Integer>s)
        {
           return s.isEmpty();
	}
}
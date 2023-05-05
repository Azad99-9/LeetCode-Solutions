//{ Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SortedStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			Stack<Integer> s=new Stack<>();
			int n=sc.nextInt();
			while(n-->0)
			s.push(sc.nextInt());
			GfG g=new GfG();
			Stack<Integer> a=g.sort(s);
			while(!a.empty()){
				System.out.print(a.peek()+" ");
				a.pop();
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/
class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		if (s.size() == 1) return s;
		
		Stack<Integer> help = new Stack<>();
		
		int tmp = s.pop();
		
		s = sort(s);
		
		if (s.peek() <= tmp) s.push(tmp);
		else {
		    while (!s.isEmpty() && s.peek() > tmp) {
		        help.push(s.pop());
		    }
		    s.push(tmp);
		    while (!help.isEmpty()) s.push(help.pop());
		}
		
		return s;
	}
}
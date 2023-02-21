import java.util.* ;
import java.io.*; 
/************************************************************

	Following is the Binary Tree node structure:

	class BinaryTreeNode<T> {
	    T data;
	    BinaryTreeNode<T> left;
	    BinaryTreeNode<T> right;

	    public BinaryTreeNode(T data) {
	        this.data = data;
	    }
	}

************************************************************/

public class Solution {

	static class Pair  {
		int level;
		BinaryTreeNode<Integer> node;
		Pair(BinaryTreeNode<Integer> _node, int _level) {
			level = _level;
			node = _node;
		}
	}
    public static List<List<Integer>> getTreeTraversal(BinaryTreeNode<Integer> root) {
        Stack<Pair> st = new Stack<>();
		st.push(new Pair(root, 1));
		List<List<Integer>> ans = new LinkedList<>();
		List<Integer> pre = new ArrayList<>();
		List<Integer> in = new ArrayList<>();
		List<Integer> post = new ArrayList<>();
		if(root == null) {
			for(int i = 0; i < 3; i++)
				ans.add(new LinkedList<>());
			return ans;
		}

		while(!st.isEmpty()) {
			Pair temp = st.pop();

			// this is part of pre
			// rincrement 1 to 2
			// push the left side of the tree
			if(temp.level == 1) {
				pre.add(temp.node.data);
				temp.level++;
				st.push(temp);
				if(temp.node.left != null) 
					st.push(new Pair(temp.node.left, 1));
			}

			// this is a part of in
			// increase 2 to 3
			// push right
			else if(temp.level == 2) {
				in.add(temp.node.data);
				temp.level++;
				st.push(temp);
				if(temp.node.right != null)
					st.push(new Pair(temp.node.right, 1));
			}

			else
				post.add(temp.node.data);
		}

		ans.add(in);
		ans.add(pre);
		ans.add(post);

		return ans;
    }
}














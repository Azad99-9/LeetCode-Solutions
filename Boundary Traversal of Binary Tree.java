import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the Binary Tree node structure:
    
   class TreeNode {
	    int data;
	    TreeNode left;
	    TreeNode right;

	    TreeNode(int data) {
		    this.data = data;
		    this.left = null;
		    this.right = null;
	    }

    }

************************************************************/

import java.util.ArrayList;

public class Solution {

	public static void addLeftBoundary(TreeNode root, ArrayList<Integer> res) {
		TreeNode cur = root.left;
		while(cur != null) {
			if(!isLeaf(cur)) res.add(cur.data);
			if(cur.left != null) cur = cur.left;
			else cur = cur.right;
		}
	}

	public static void addRightBoundary(TreeNode root, ArrayList<Integer> ans) {
		TreeNode cur = root.right;
		ArrayList<Integer> tmp = new ArrayList<>();
		while(cur != null) {
			if(!isLeaf(cur)) tmp.add(cur.data);
			if(cur.right != null) cur = cur.right;
			else cur = cur.left;
		}
		int i;
		for(i = tmp.size() - 1; i >= 0; --i)
			ans.add(tmp.get(i));
	}

	public static void addLeaves(TreeNode root, ArrayList<Integer> res) {
		if(isLeaf(root)) {
			res.add(root.data);
			return;
		}
		if(root.left != null) addLeaves(root.left, res);
		if(root.right != null) addLeaves(root.right, res);
	}

	public static boolean isLeaf(TreeNode root) {
		if(root.left == null && root.right == null) return true;
		return false;
	}
	public static ArrayList<Integer> traverseBoundary(TreeNode root){
		ArrayList<Integer> ans = new ArrayList<>();
		if(!isLeaf(root)) ans.add(root.data);
		addLeftBoundary(root, ans);
		addLeaves(root, ans);
		addRightBoundary(root, ans);
		return ans;
	}
}


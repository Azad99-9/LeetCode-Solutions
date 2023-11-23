class Solution {

    Node removekeys(Node root, int l, int r) {

       if (root == null) return null;
       
       if (root.data > r) return removekeys(root.left, l, r);
       
       if (root.data < l) return removekeys(root.right, l, r);
       
       root.left = removekeys(root.left, l, r);
       root.right = removekeys(root.right, l, r);
       
       return root;

	}

}

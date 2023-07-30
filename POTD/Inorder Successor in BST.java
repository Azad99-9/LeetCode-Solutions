class Solution
{
    // returns the inorder successor of the Node x in BST (rooted at 'root')
	public Node inorderSuccessor(Node root,Node x)
         {
          Node succ = null;
          while (root != null) {
              if (root.data > x.data) {
                  succ = root;
                  root = root.left;
              } else {
                  root = root.right;
              }
          }
          return succ;
         }
}
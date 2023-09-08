class Solution
{
    // The given root is the root of the Binary Tree
    // Return the root of the generated BST
    int i = 0;
    
    void insertInorder(ArrayList<Integer> help, Node node) {
        if (node == null) return;
        
        insertInorder(help, node.left);
        help.add(node.data);
        insertInorder(help, node.right);
    }
    
    void modifyTree (ArrayList<Integer> help, Node node) {
        if (node == null) return;
        
        modifyTree(help, node.left);
        node.data = help.get(i++);
        modifyTree(help, node.right);
    }
    
    Node binaryTreeToBST(Node root)
    {
       ArrayList<Integer> help = new ArrayList<>();
       
       insertInorder(help, root);
       Collections.sort(help);
       modifyTree(help, root);
       
       return root;
    }
}
 
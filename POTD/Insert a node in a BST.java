class Solution {
    // Function to insert a node in a BST.
    Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (key == root.data) return root;
        
        if (key < root.data) root.left = insert(root.left, key);
        if (key > root.data) root.right = insert(root.right, key);
        
        return root;
    }
}
class Tree {
    ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<Node> stack = new Stack<>();
        Node prev = null;

        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                Node peek = stack.peek();
                if (peek.right != null && prev != peek.right) {
                    root = peek.right;
                } else {
                    result.add(peek.data);
                    prev = stack.pop();
                }
            }
        }

        return result;
    }
}

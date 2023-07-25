// A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/



class Spiral {
    // Function to return a list containing the level order
    // traversal in spiral form.

    void copy(List<Integer> from, ArrayList<Integer> ans) {
        for (int i = 0; i < from.size(); i++) {
            ans.add(from.get(i));
        }
    }

    ArrayList<Integer> findSpiral(Node root) {
        Queue<Node> aux = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int level = 0;
        aux.offer(root);
        while (!aux.isEmpty()) {
            int size = aux.size();
            if ((level & 1) == 0) // Corrected the bitwise AND operation
                copy(reverseList(new ArrayList<>(aux)), ans); // Added the method to reverse the list
            else {
                for (int i = 0; i < aux.size(); i++) {
                    ans.add(aux.peek().data);
                    aux.offer(aux.poll());
                }
            }
            for (int i = 0; i < size; i++) {
                Node cur = aux.poll();
                if (cur.left != null)
                    aux.offer(cur.left);
                if (cur.right != null) // Corrected the if condition here
                    aux.offer(cur.right);
            }
            level++;
        }
        return ans;
    }

    private List<Integer> reverseList(List<Node> list) {
        Collections.reverse(list);
        List<Integer> reversedData = new ArrayList<>();
        for (Node node : list) {
            reversedData.add(node.data);
        }
        return reversedData;
    }

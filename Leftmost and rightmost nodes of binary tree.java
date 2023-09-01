class Tree
{
    public static void printCorner(Node node)
    {
        
        Queue<Node> q = new LinkedList<>();
        q.offer(node);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node cur = q.poll();
                if (i == 0 && size-1 == 0) {
                    System.out.print(cur.data+" ");
                    
                } else {
                    if (i == 0) System.out.print(cur.data+" ");
                    if (i == size - 1) System.out.print(cur.data+" ");
                }
                if (cur.left != null) q.offer(cur.left);
                if (cur.right != null) q.offer(cur.right);
            }
        }
        return;
    }
    
}
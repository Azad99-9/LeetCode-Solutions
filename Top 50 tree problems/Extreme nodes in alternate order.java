class Solution{
    public  ArrayList<Integer> ExtremeNode(Node root)
      {
        List<Node> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        q.add(root);
        ans.add(root.data);
        
        int level = 0;
        
        while (!q.isEmpty()) {
            int size = q.size();
            
            if (level % 2 == 0) {
                ans.add(q.get(size - 1).data);
            } else {
                ans.add(q.get(0).data);
            }
            
            for (int i = 0; i < size; i++) {
                Node cur = q.remove(0);
                if (cur.left != null) q.add(cur.left);
                if (cur.right != null) q.add(cur.right);
            }
            
            level++;
        }
        
        ans.remove(0);
        return ans;
        
      }
}

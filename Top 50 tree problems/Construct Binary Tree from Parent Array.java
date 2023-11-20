class Solution
{
    //Function to construct binary tree from parent array.
    public static Node createTree(int parent[], int N)
    {
        Map<Integer, ArrayList<Integer>> mp = new HashMap<>();
        
        for (int i = 0; i < N; i++) {
            if (mp.containsKey(parent[i])) mp.get(parent[i]).add(i);
            else {
                ArrayList<Integer> t = new ArrayList<>();
                t.add(i);
                mp.put(parent[i], t);
            }
        }
        
        Queue<Node> q = new LinkedList<>();
        
        Node root = new Node(mp.get(-1).get(0));
        q.offer(root);
        
        while (!q.isEmpty()) {
            Node cur = q.poll();
            
            Node t = null;
            ArrayList<Integer> adjs = mp.get(cur.data);
                if (adjs != null) {
                    if (adjs.size() > 0) {
                    t = new Node(adjs.get(0));
                    cur.left = t;
                    q.offer(t);
                    
                }
                if (adjs.size() > 1) {
                    t = new Node(adjs.get(1));
                    cur.right = t;
                    q.offer(t);
                }
            }
        }
        
        return root;
        
        
    }
    
}



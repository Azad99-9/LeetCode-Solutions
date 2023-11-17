class Solution
{
    static class Pair{
    int hd;
    Node node;
    public Pair(int hd , Node node){
        this.hd = hd;
        this.node = node;
    }
}
    
    //Function to find the vertical order traversal of Binary Tree.
    static ArrayList <Integer> verticalOrder(Node root)
    {
       Map<Integer , ArrayList<Integer>> map = new TreeMap<>();
       Queue<Pair> q = new ArrayDeque<>();
       q.add(new Pair(0 , root));
       
       while(!q.isEmpty()){
           Pair curr = q.poll();
           
           if(map.containsKey(curr.hd)){
               map.get(curr.hd).add(curr.node.data);
           }
           else {
               ArrayList<Integer> temp = new ArrayList<>();
               temp.add(curr.node.data);
               map.put(curr.hd ,temp);
           }
           
           if(curr.node.left != null){
               q.add(new Pair(curr.hd - 1 , curr.node.left) );
           }
           if(curr.node.right != null){
               q.add(new Pair(curr.hd + 1 , curr.node.right));
           }
         }
       
       ArrayList<Integer> ans = new ArrayList<Integer>();
       for(Map.Entry<Integer , ArrayList<Integer>> entry : map.entrySet())
           ans.addAll(entry.getValue());
       
       return ans;
    }
}

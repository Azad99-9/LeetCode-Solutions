class Solution
{
    int count = 0;
    void helper(Node root, int k, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        int size = path.size();
        int sum = 0;
        for(int i = size-1; i >= 0; i--){
            sum += path.get(i);
            if(sum == k){
                count++;
            }
        }
        helper(root.left, k, path);
        helper(root.right, k, path);
        path.remove(path.size()-1);
        
    }
    public int sumK(Node root,int k)
    {
        ArrayList<Integer> path = new ArrayList<>();
        helper(root, k, path);
        return count;
    }
}

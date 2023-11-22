class Solution
{
    static int sum;
    public static void solve(Node root)
    {
        if (root == null)
            return;
    
        solve(root.right);
        
        int temp = root.data;
        root.data = sum;
        sum += temp;
        
        solve(root.left);
    }
    
    public static void transformTree(Node root)
    {
        sum = 0;
        solve(root);
    }
}

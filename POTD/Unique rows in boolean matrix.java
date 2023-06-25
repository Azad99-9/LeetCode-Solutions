/*Complete the given function*/
class GfG
{
    public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][],int r, int c)
    {
        Set<ArrayList<Integer>> set = new HashSet<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        for (int i = 0; i < r; i++) {
            ArrayList<Integer> cur = new ArrayList<>();
            for (int j = 0; j < c; j++) cur.add(a[i][j]);
            if (!set.contains(cur)) {
                set.add(cur);
                ans.add(cur);
            }
            // System.out.println(set);
            
        }
        return ans;
    }
}
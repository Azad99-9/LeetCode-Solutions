class Solution {
    public List<Integer> relocateMarbles(int[] nums, int[] moveFrom, int[] moveTo) {

        
        Set<Integer> set = new HashSet<>();
        for (int i: nums) set.add(i);
        // System.out.println(set);
        
        for (int i = 0; i < moveFrom.length; i++) {
            set.remove(moveFrom[i]);
            set.add(moveTo[i]);
        }
        // System.out.println(set);
        
        ArrayList<Integer> ans = new ArrayList<>(set);
        Collections.sort(ans);
        // System.out.println(ans);
        return  ans;
    }
}
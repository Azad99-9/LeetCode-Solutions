class Solution {
    public static boolean isFrequencyUnique(int n, int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++)  {
            if (map.containsKey(arr[i]))  {
                int curF  = map.get(arr[i]);
                map.put(arr[i], curF+1);
            } else {
                map.put(arr[i], 1);
            }
        }
        
        Set<Integer>  set = new HashSet<>();
        for (Map.Entry<Integer, Integer> ent: map.entrySet()) {
            if (set.contains(ent.getValue())) return false;
            set.add(ent.getValue());
        }
        
        return true;
    }
}
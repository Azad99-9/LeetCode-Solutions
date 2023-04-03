class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> hm = new HashMap<>();
        for(String s : strs){
            
            char[] chars=s.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            
            if (!hm.containsKey(key)) {
                hm.put(key, new ArrayList<>());
            }
            hm.get(key).add(s);
            
        }
        return new ArrayList<>(hm.values());
    }
}

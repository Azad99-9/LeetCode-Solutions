
class Solution {
    String solve(Node root, Map<String, Integer> map) {
        if (root == null) return "$";
        String s = "";
        if (root.left == null && root.right == null) {
            s = String.valueOf(root.data);
            return s;
        }
        
        s = s + String.valueOf(root.data);
        s = s + solve(root.left, map);
        s = s + solve(root.right, map);
        int ct = 0;
        if (map.containsKey(s)) ct = map.get(s);
        map.put(s, ct + 1);
        return s;
    }
    
    int dupSub(Node root) {
        Map<String, Integer> map = new HashMap<>();
        solve(root, map);
        for (Map.Entry<String, Integer> ent : map.entrySet()) {
            if (ent.getValue() > 1) return 1;
        }
        return 0;
        
    }
}
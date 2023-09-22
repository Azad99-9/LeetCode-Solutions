class Solution {
    public String simplifyPath(String path) {
        String[] pathArray = path.split("/");
        System.out.println(Arrays.toString(pathArray));
        Set<String> chars = new HashSet<>();
        Stack<String> stk = new Stack<>();

        chars.add("");
        chars.add(" ");
        chars.add(".");
        chars.add("..");
        System.out.println(chars);
        StringBuilder ans = new StringBuilder();
        // ans.append("/");
        for (String s: pathArray) {
            if (chars.contains(s)) {
                if (s.equals("..") && !stk.isEmpty()) {
                    stk.pop();
                }
            } else {
                stk.push(s);
            }
        }
        Collections.reverse(stk);
        while (!stk.isEmpty()) {
            ans.append("/");
            ans.append(stk.pop());
        }
        return ans.length() == 0 ? "/" : ans.toString();
    }
}
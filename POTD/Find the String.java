class Solution{
    public boolean dfs(int n, int k, int totalPossibilities, StringBuilder path, Set<String> visited) {
        if (visited.size() == totalPossibilities) {
            return true;
        }
        for (int i = 0; i < k; i++) {
            String currNode = path.substring(path.length() - n + 1) + (char) ('0' + i);
            if (!visited.contains(currNode)) {
                visited.add(currNode);
                path.append((char) ('0' + i));
                if (dfs(n, k, totalPossibilities, path, visited)) {
                    return true;
                }
                path.deleteCharAt(path.length() - 1);
                visited.remove(currNode);
            }
        }
        return false;
    }

    public String findString(int n, int k) {
        StringBuilder path = new StringBuilder("0".repeat(n - 1));
        Set<String> visited = new HashSet<>();
        int totalPossibilities = (int) Math.pow(k, n);
        dfs(n, k, totalPossibilities, path, visited);
        return path.toString();
    }
}

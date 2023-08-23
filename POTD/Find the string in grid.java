class Solution
{
    public boolean check (int x, int y, String s, int curIndex, 
    int k, char[][] matrix, String direction) {
        if (curIndex == k) return true;
        if (x >= matrix.length || y >= matrix[0].length || x < 0 || y < 0) return false;
        
        boolean found = false;
        if (s.charAt(curIndex) != matrix[x][y]) return false;
        

        
            switch(direction) {
                case "":
                    int ct = 0; 
                    for (int i = -1; i < 2; i++) {
                        for (int j = -1; j < 2; j++) {
                            switch(ct) {
                                case 0:
                                    direction = "ul";
                                    break;
                                case 1:
                                    direction = "u";
                                    break;
                                case 2:
                                    direction = "ur";
                                    break;
                                case 3:
                                    direction = "l";
                                    break;
                                case 4:
                                    direction = "0";
                                    break;
                                case 5:
                                    direction = "r";
                                    break;
                                case 6:
                                    direction = "bl";
                                    break;
                                case 7:
                                    direction = "b";
                                    break;
                                case 8:
                                    direction = "br";
                                    break;
                                    
                            }
                        if (ct!=4) found = check(x+i, y+j, s, curIndex + 1, k, matrix, direction);
                        if (found) return true;
                        ct++;
                    }
                }
                break;
            case "ul":
                found = check(x-1, y-1, s, curIndex+1, k, matrix, direction);
                break;
            case "u":
                found = check(x-1, y, s, curIndex+1, k, matrix, direction);
                break;
            case "ur":
                found = check(x-1, y+1, s, curIndex+1, k, matrix, direction);
                break;
            case "l":
                found = check(x, y-1, s, curIndex+1, k, matrix, direction);
                break;
            case "r":
                found = check(x, y+1, s, curIndex+1, k, matrix, direction);
                break;
            case "bl":
                found = check(x+1, y-1, s, curIndex+1, k, matrix, direction);
                break;
            case "b":
                found = check(x+1, y, s, curIndex+1, k, matrix, direction);
                break;
            case "br":
                found = check(x+1, y+1, s, curIndex+1, k, matrix, direction);
                break;
            }
        
        
        
        return found;
    }
    public int[][] searchWord(char[][] grid, String word)
    {
        int n = grid.length;
        int m = grid[0].length;
        int c = word.length();
        
        ArrayList<int[]> ans = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (check(i, j, word, 0, word.length(), grid, "")) {
                    ans.add(new int[]{i, j});
                }
            }
        }
        
        int[][] a = new int[ans.size()][2];
        for (int i = 0; i < a.length; i++) {
            a[i] = ans.get(i);
        }
        
        return a;
    }
}
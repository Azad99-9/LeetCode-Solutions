class Solution {
    public boolean buddyStrings(String s, String goal) {
        int i1 = 0;
        int i2 = 0;
        int j1 = s.length()-1;
        int j2 = goal.length()-1;
        int n1 = s.length();
        int n2 = goal.length();

        if (s.equals(goal)) {
            Set<Character> temp = new HashSet<>();
            for (char c : s.toCharArray()) {
                temp.add(c);
            }
            return temp.size() < goal.length(); // Swapping same characters
        }

        while (i1 < n1 && i2 < n2 && s.charAt(i1) == goal.charAt(i2)) {
            i1++; i2++;
        }
        if (i1 == n1 || i2 == n2) return false;
        while (j1 > -1 && j2 > -1 && s.charAt(j1) == goal.charAt(j2)) {
            j1--; j2--;
        }
        if (j1 <= i1 || j2 <= i2) return false;
        // System.out.println(i1 + " " + i2 + " " + j1 + " " + j2);
        char[] sarr = s.toCharArray();
        char tmp = sarr[i1];
        sarr[i1] = sarr[j1];
        sarr[j1] = tmp;
        s = new String(sarr);


        return s.equals(goal);
    }
}
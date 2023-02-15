class Solution {
    public int romanToInt(String s) {
    //T-O(1)
    //S-O(1)
        Map<Character, Integer> help = new HashMap<>();
        help.put('I',1);
        help.put('V',5);
        help.put('X',10);
        help.put('L',50);
        help.put('C',100);
        help.put('D',500);
        help.put('M',1000);

        int i= s.length()-2;
        int ans = help.get(s.charAt(s.length()-1));
        while(i> -1) {
            if(help.get(s.charAt(i)) >= help.get(s.charAt(i+1))) {
                ans+= help.get(s.charAt(i));
                i--;
            }
            else {
                ans-= help.get(s.charAt(i));
                i--;
            }
        }

        return ans;

    }
}

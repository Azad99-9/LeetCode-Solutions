class Solution {
    public String reverseWords(String s) {
        //T-O(n)
        //S-O(n)
        int i= s.length()-1;

        String ans = "";

        while(i>= 0) {
            while(i>= 0 && s.charAt(i) == ' ') i--;
            if(i<0) break;

            int j= i;
            while(i>= 0 && s.charAt(i) != ' ') i--;

            if(ans.isEmpty())
                ans = ans.concat(s.substring(i+1,j+1));
            else 
                ans = ans.concat(" "+s.substring(i+1,j+1));
        }

        return ans;
    }
}

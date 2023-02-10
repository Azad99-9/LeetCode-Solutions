class Solution {
    //T-O(n)
    //S-O(1)
    public boolean isValid(String s) {
        Stack<Character> auxilary = new Stack<>();
        for(int i= 0; i< s.length(); i++) {
            if(auxilary.isEmpty()) {
                auxilary.push(s.charAt(i));
                continue;
            } else {
                char temp = auxilary.peek();
                if(temp == '(' && s.charAt(i) == ')')
                    auxilary.pop();
                else if(temp == '{' && s.charAt(i) == '}')
                    auxilary.pop();
                else if(temp == '[' && s.charAt(i) == ']')
                    auxilary.pop();
                else
                    auxilary.push(s.charAt(i));
            } 
        }
        if(auxilary.isEmpty())
            return true;
        return false;
    }
}

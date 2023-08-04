
class Solution
{ 
    static void insertAtBtm(Stack<Integer> s, int el) {
        if (s.isEmpty()) {
            s.push(el);
            return;
        }
        
        int tmp = s.pop();
        insertAtBtm(s, el);
        s.push(tmp);
    }
    static void reverse(Stack<Integer> s)
    {
        if (s.size() == 1) return;
        
        int tmp = s.pop();
        reverse(s);
        insertAtBtm(s, tmp);
    }
}
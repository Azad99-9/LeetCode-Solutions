class Solution{
    int mean(Node root, int key){
        Node pred = null;
        
        Node cur = root;
        while (cur != null) {
            if (cur.data > key) cur = cur.left;
            else if (cur.data == key) {
                pred = cur;
                break;
            }
            else {
                pred  = cur;
                cur = cur.right;
            }
        }
        
        Node succ = null;
        cur = root;
        while (cur != null) {
            if (cur.data < key) cur = cur.right;
            else if (cur.data == key) {
                succ = cur;
                break;
            }
                else {
                    succ = cur;
                    cur = cur.left;
                }
            }
        
        int ans = 0;
        if (pred  !=  null) ans += pred.data;
        else ans += -1;
        if (succ != null) ans += succ.data;
        else ans += -1;
        // System.out.println("hi");
        return (int)Math.ceil(ans/(float)2);
    }
}
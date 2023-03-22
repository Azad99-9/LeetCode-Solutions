class Node {
    Node[] links = new Node[2];
    public Node() {

    }
    Node get(int bit) {
        return links[bit];
    }

    boolean containsKey(int bit) {
        return (links[bit] != null);
    }

    void set(int bit, Node node) {
        links[bit] = node;
    } 
}

class Trie {
    Node root;
    public Trie() {
        root = new Node();
    }

    public void insert(int num) {
        Node node = root;
         for(int i = 31; i >= 0; i--) {
             int bit = (num>>i)&1;
            if(!node.containsKey(bit)) {
                node.set(bit, new Node());
            }
            node = node.get(bit);
         }
    }
    public int maxXor(int num) {
        Node node = root; 
        int ans = 0;
        for(int i= 31; i >=0; i--) {
            int bit= (num>>i)&1;
            if(node.containsKey(1-bit)) {
                ans = ans | 1<<i;
                node = node.get(1-bit);
            } else {
                node = node.get(bit);
            }
        
        }
        return ans;
    }

    }

    


class Solution {
    public int findMaximumXOR(int[] nums) {
        int n = nums.length;
        int maxi = 0;
        Trie trie = new Trie();
        for(int ele: nums) {
            trie.insert(ele);
        }
        for(int ele: nums) {
            maxi = Math.max(maxi, trie.maxXor(ele));
        }
        return maxi;
    }
}

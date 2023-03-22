class Node{
	Node[] links = new Node[2];

	public boolean isContainsKey(int bit){
		return links[bit]!=null;
	}

	public Node get(int bit){
		return links[bit];
	}

	public void put(int bit, Node node){
		links[bit]=node;
	}
}

class Trie{
	Node root;

	Trie(){
		root = new Node();
	}

	public void insert(int num){
		Node node = root;
        // creating bit and storing into trie
		for(int i=31; i>=0; i--){
			int bit =  1 & (num>>i);

			if(!node.isContainsKey(bit)){
				node.put(bit, new Node());
			}
			node = node.get(bit);
		}
	}

	public int search(int num){
		Node node = root;

        int longest=0;
		for(int i=31; i>=0; i--){
			int bit = 1 & (num>>i) ;

            // we need longest using XOR.
			// we started from left to right side.
			// so will try to find current bit opposite so that number can be maximize
			// if find in trie will set the bit on for longest(number)
			// else we have zero already. it is okay
			if(node.isContainsKey(1-bit)){
				node = node.get(1-bit);
				longest =  (1<<i) | longest; // make the bit on
				
			}
			else{
                 node = node.get(bit);
			}
		}
		return longest;
	}
}
class Solution {
    public int[] maximizeXor(int[] nums, int[][] queries) {
        int m = queries.length;
        int[] ans = new int[m];
        
        
        int[][] query = new int[m][3];
        for(int i=0; i<m; i++){
            // at 0 xi
            // at 1 ai
            // at 2 its position
            query[i][0]=queries[i][0];
            query[i][1]=queries[i][1];
            query[i][2]=i;


            // maintaing -1 initailly in answer
            ans[i]= -1;
        }
         // sorting using ai
        Arrays.sort(query, (a, b) -> a[1] - b[1]);

        // Sorting main array also
        Arrays.sort(nums);

        int index=0;
        Trie trie = new Trie();

        for(int i=0; i<m; i++){

            while(index<nums.length && nums[index]<= query[i][1]){
                trie.insert(nums[index]);
                index++;

            }
            if(index!=0){
                ans[query[i][2]]=  trie.search(query[i][0]) ;
            }
        }

        return ans;


    }
}

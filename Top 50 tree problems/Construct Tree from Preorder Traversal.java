class Solution{
    int i = 0;
    Node constructTree(int n, int pre[], char preLN[]){
	    if (i >= n) return null;
	    Node nN = new Node(pre[i]);
	    i++;
	    
	    if (preLN[i-1] == 'N') {
	        nN.left = constructTree(n, pre, preLN);
	        nN.right = constructTree(n, pre, preLN);
	    }
	    
	    return nN;
    }
}

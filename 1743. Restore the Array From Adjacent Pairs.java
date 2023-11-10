class Solution {
    public int[] restoreArray(int[][] adjacentPairs) {
        
        //length of restoredArray would be input length+1
        int[] restoredArray = new int[adjacentPairs.length+1];
     
        Map<Integer, List<Integer>> graph = new HashMap<Integer, List<Integer>>();
        
        // 1. Build graph of number -> [adjacent numbers]
        for(int i= 0; i < adjacentPairs.length; i++){
             addToGraph(graph, adjacentPairs[i][0], adjacentPairs[i][1]);
             addToGraph(graph, adjacentPairs[i][1], adjacentPairs[i][0]);
         }
        
         // 2. Find first number with only one adjacent number i.e. in-degree = 1. That wil be our start.
		 // eg. get -3 or -2 as our start. 
        //There would always be two elements which satisfy this conditon & starting from either would suffice. 
         int start = 0;
         for(int key : graph.keySet()){
             if(graph.get(key).size()==1){
                 start = key;
                 break;
            }
         }
        Set<Integer> seenSet = new HashSet<Integer>();
        List<Integer> answerList = new ArrayList<Integer>();
        dfs(start,graph,answerList,seenSet);

        for(int i=0;i<answerList.size();i++){
            restoredArray[i] = answerList.get(i);
        }
        return restoredArray;
    }
    
    /****** Template DFS Code *******/
    private void dfs(int start,Map<Integer, List<Integer>> graph,List<Integer> answerList,Set<Integer> seenSet){
        answerList.add(start);
        seenSet.add(start);
        List<Integer> neighbors = graph.get(start);
        //loop over adjacents like you do in BFS, here adjacents are fetched from the constructed graph.
        for(Integer curr : neighbors){
            if(!seenSet.contains(curr)){
                 dfs(curr,graph,answerList,seenSet);
            }
        } 
    }

    //Utility function which simply builds graph of [numbers] -> [list of adjacent numbers]
    	// eg. [[4,-2],[1,4],[-3,1]]
		// map will be  4 ->[-2,1], 1->[-3,4], -2->[4], -3->[1]
	  private void addToGraph(Map<Integer, List<Integer>> graph, int key, int value) {
		     if(graph.containsKey(key)){
                 graph.get(key).add(value);
             }else{
                 List<Integer> temp = new ArrayList<Integer>();
                 temp.add(value);
                 graph.put(key, temp);
             }  
	  }
}

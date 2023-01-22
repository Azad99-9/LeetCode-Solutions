import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> indices = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            
            if(!indices.containsKey(target-nums[i])){
                
                indices.put(nums[i],i);
                
            }else{
                
                int[] result = new int[2];
                
                result[0] =  indices.get(target-nums[i]);
                result[1] = i;
                
                return result;
                
            }
            
        }
        
        return null;
        
    }
}

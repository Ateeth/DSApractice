//Question Link : https://leetcode.com/problems/combination-sum-ii/
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>() ; 
        List<Integer> tempList = new ArrayList<>() ; 
        Arrays.sort(candidates) ; 
        backtrack(ans , tempList , candidates , target , 0) ; 
        return ans ; 
    }
    
    
    public static void backtrack(List<List<Integer>> ans , List<Integer> tempList , int[] candidates , int remaining , int idx){
        if(remaining < 0){
            return ; 
        }
        
        if(remaining == 0){
            ans.add(new ArrayList<>(tempList)) ; 
        }
        
        for(int i = idx ; i < candidates.length ; ++i){
            if(i > idx && candidates[i] == candidates[i - 1]){
                continue ; 
            }
            
            tempList.add(candidates[i]) ;
            
            //as cant reuse same element increase the index
            backtrack(ans , tempList , candidates , remaining - candidates[i] , i + 1) ;
            tempList.remove(tempList.size() - 1) ; 
        }
    }
}

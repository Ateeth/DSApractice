//Question Link : https://leetcode.com/problems/combination-sum/

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
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
            
            //i not i - 1 as we can reuse same element again
            backtrack(ans , tempList , candidates , remaining - candidates[i] , i) ;
            tempList.remove(tempList.size() - 1) ; 
        }
    }
}

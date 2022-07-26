//Problem Link : https://takeuforward.org/data-structure/subset-sum-sum-of-all-subsets/

import java.util.* ; 
public class Solution {
    public static ArrayList<Integer> subsetSum(int nums[]) {
        ArrayList<Integer> ans = new ArrayList<>() ;
        findSum(nums , ans , 0 , 0) ; 
        Collections.sort(ans) ; 
        return ans ; 
    }
    
    public static void findSum(int[] nums , ArrayList<Integer> ans , int sum , int idx){
        if(idx == nums.length){
            ans.add(sum) ; 
            return ;
        }
        
        findSum(nums , ans , sum + nums[idx] , idx + 1) ; 
        findSum(nums , ans , sum , idx + 1)  ; 
    }

}

//Problem Link : https://leetcode.com/problems/combination-sum/
package com.ateeth.LeetCodeDSA.Recursion.ImportantProgramsThatCanServeAsTemplates;

import java.util.* ;
public class CombinationSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
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
            tempList.add(candidates[i]) ;

            //i not i - 1 as we can reuse same element again
            backtrack(ans , tempList , candidates , remaining - candidates[i] , i) ;
            tempList.remove(tempList.size() - 1) ;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter number of elements : ");
        int n = sc.nextInt();

        int[] nums = new int[n] ;
        System.out.println("Enter array elements : ");
        for(int i = 0 ; i < n ; ++i){
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter target value : ");
        int target = sc.nextInt();
        List<List<Integer>> ans = combinationSum(nums , target) ;
        for(List<Integer> l : ans){
            System.out.println(l);
        }
    }
}

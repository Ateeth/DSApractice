//Problem Link : https://leetcode.com/problems/permutations/
package com.ateeth.LeetCodeDSA.Recursion.ImportantProgramsThatCanServeAsTemplates;

import java.util.* ;
public class Permutations {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>() ;
        List<Integer> tempList = new ArrayList<>() ;
        backtrack(ans , tempList , nums) ;
        return ans ;
    }

    public static void backtrack(List<List<Integer>> ans , List<Integer> tempList , int[] nums){
        if(tempList.size() == nums.length){
            ans.add(new ArrayList<>(tempList)) ;
        }

        for(int i = 0 ; i < nums.length ; ++i){
            if(tempList.contains(nums[i])){
                continue ;
            }

            tempList.add(nums[i]) ;
            backtrack(ans , tempList , nums) ;
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

        List<List<Integer>> ans = permute(nums) ;
        for(List<Integer> l : ans){
            System.out.println(l);
        }
    }
}

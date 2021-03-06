//Problem Link : https://leetcode.com/problems/subsets-ii/
package com.ateeth.LeetCodeDSA.Recursion.ImportantProgramsThatCanServeAsTemplates;

import java.util.* ;
public class SubsetsII {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>() ;
        List<Integer> tempList = new ArrayList<>() ;
        Arrays.sort(nums) ;
        backtrack(ans , tempList , nums , 0) ;
        return ans ;
    }

    public static void backtrack(List<List<Integer>> ans , List<Integer> tempList , int[] nums , int idx){
        ans.add(new ArrayList<>(tempList)) ;
        for(int i = idx ; i < nums.length ; ++i){
            //skip duplicates after index idx
            if(i > idx && nums[i] == nums[i - 1]){
                continue ;
            }
            tempList.add(nums[i]) ;
            backtrack(ans , tempList , nums , i + 1) ;
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

        List<List<Integer>> ans = subsetsWithDup(nums) ;
        for(List<Integer> l : ans){
            System.out.println(l);
        }
    }
}

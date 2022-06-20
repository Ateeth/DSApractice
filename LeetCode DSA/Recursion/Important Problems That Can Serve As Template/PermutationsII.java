//Problem Link : https://leetcode.com/problems/permutations-ii/
package com.ateeth.LeetCodeDSA.Recursion.ImportantProgramsThatCanServeAsTemplates;

import java.util.* ;
public class PermutationsII {
    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>() ;
        List<Integer> tempList = new ArrayList<>() ;
        Arrays.sort(nums) ;
        boolean[] used = new boolean[nums.length] ;
        backtrack(ans , tempList , nums , used) ;
        return ans ;
    }

    public static void backtrack(List<List<Integer>> ans , List<Integer> tempList , int[] nums , boolean[] used){
        if(tempList.size() == nums.length){
            ans.add(new ArrayList<>(tempList)) ;
            return ;
        }

        for(int i = 0 ; i < nums.length ; ++i){
            if(used[i] || i > 0 && nums[i] == nums[i-1] && !used[i - 1]){
                continue ;
            }

            tempList.add(nums[i]) ;
            used[i] = true ;
            backtrack(ans , tempList , nums , used) ;
            used[i] = false ;
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

        List<List<Integer>> ans = permuteUnique(nums) ;
        for(List<Integer> l : ans){
            System.out.println(l);
        }
    }
}

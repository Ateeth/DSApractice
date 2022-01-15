//problem link : https://leetcode.com/problems/build-array-from-permutation/

package com.ateeth.LeetCodeDSA.arrays.easy;
import java.util.* ;
public class BuildArrayFromPermutation {
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length] ;
        for(int i = 0 ; i < nums.length ; ++i){
            ans[i] = nums[nums[i]] ;
        }
        return ans ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter size of the array : ") ;
        int len = sc.nextInt() ;

        int[] nums = new int[len] ;
        System.out.println("Enter the elements of the array: ") ;
        for(int i = 0 ; i < len ; ++i){
            nums[i] = sc.nextInt() ;
        }

        int[] ans = buildArray(nums) ;

        System.out.println(Arrays.toString(ans)) ;
    }
}

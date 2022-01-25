//Problem Link : https://leetcode.com/problems/4sum/
package com.ateeth.LeetCodeDSA.searching.medium.VeryImportant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FourSum {

    public static ArrayList<ArrayList<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>() ;

        if(nums == null || nums.length == 0){
            return ans ;
        }
        int n = nums.length ;

        for( int i = 0 ; i < n - 3 ; ++i ){
            for( int j = i + 1  ; j < n  - 2 ; ++ j ){
                //Now that we have established i and j we need to fing the resultant target in the rest of array
                int newTarget = target - nums[i] - nums[j] ;
                //now do 2 sum on rest of array to find newTarget

                int left = j + 1 ;
                int right = n - 1 ;

                while( left < right ){
                    int two_sum = nums[left] + nums[right] ;
                    if( two_sum < newTarget ){ //move the left pointer front
                        ++left ;
                    }else if( two_sum > newTarget ){ //move right pointer back
                        --right ;
                    }else{ //two_sum has been made equal to newTarget
                        ArrayList<Integer> quad = new ArrayList<>() ; //to get the quadruple
                        quad.add(nums[i]) ;
                        quad.add(nums[j]) ;
                        quad.add(nums[left]) ;
                        quad.add(nums[right]) ;
                        ans.add(quad) ; //add it to the final answer list

                        //now to find possibility of another 2 sum combination with same i and j
                        while( left < right && nums[left] == quad.get(2)){
                            //check 3rd element of current quadruple and see if it equal to nums[left] we have to skip the duplicates
                            ++left ;
                        }

                        while( left < right && nums[right] == quad.get(3)){
                            //check 4th element of current quadruple and see if it equal to nums[right] we have to skip the duplicates
                            --right ;
                        }

                    }
                }

                //process duplicates of number at position j
                while( j + 1 < n && nums[j] == nums[j+1] ){
                    ++j ; //to avoid duplicates of j pointer and avoid same combinations
                }
            }
            //process duplicates of number at position i
            while( i + 1 < n && nums[i] == nums[i+1] ){
                ++i ; //to avoid duplicates of i pointer and avoid same combinations
            }
        }
        return ans ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of elements in the array : ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the array : ");
        int[] arr = new int[n] ;
        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt() ;
        }


        System.out.println("Enter the target value : ");
        int target = sc.nextInt();

        ArrayList<ArrayList<Integer>> ans = fourSum(arr , target) ;

        for(ArrayList x : ans){
            System.out.println(x);
        }
    }
}

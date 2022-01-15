//Problem Link : https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

package com.ateeth.LeetCodeDSA.arrays.easy.CouldNotThinkOfOptimalSolution;

import java.util.Arrays;
import java.util.Scanner;



public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        /* we can do in O^2 time complexity but exceed time limit*/
        int[] count = new int[101] ;
        /*as given numbers from 0 to 100 this will store the count if all elements in nums*/

        //find the frequency of each element in nums
        for( int number : nums ){ //foreach loop
            ++count[number] ;
        }

        /*take the cumulative sum
        as eg nums = [1 5 7 2 3 6 1 3 4]
        count = [0 2 1 2 1 1 1 1 0 0 0 0 ....till 101 position]
        array with number of elements smaller than a number
        counter = [0 2+0 1+2+0 2+1+2+0 ....]
        as an element smaller than 1 will definitely be smaller than 2 as well so we add the number of elements smaller
        than 1 to number of element smaller than 2 as well*/
        for( int i = 1 ; i < 101 ; ++i){
            count[i] += count[i-1] ;
        }

        /* now we got how many elements in the array are smaller than all numbers between 0 and 101 and it is in count
        array so now for example nums = [8 1 2 2 3]
        count of numbers less than them
        [0 1 3 4 4 4 4 4 5]
         0 1 2 3 4 5 6 7 8

         let position = nums[i] this position number we need

         if position == 0 assign ans[0] = 0 as number of elements less than 0 is 0
         else assign ans[i] = count[position - 1]

         take value 8 in this case
         the number of elements smaller than 8 are 4*/

        int[] ans = new int[nums.length] ;
        for(int i = 0 ; i < nums.length ; ++i){
            int pos = nums[i] ;
            if(pos == 0){
                ans[i] = 0 ;
            }else{
                //pos - 1 as 0 based indexing
                ans[i] = count[pos - 1] ;
            }
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

        int[] ans = smallerNumbersThanCurrent(nums) ;

        System.out.println(Arrays.toString(ans)) ;
    }
}

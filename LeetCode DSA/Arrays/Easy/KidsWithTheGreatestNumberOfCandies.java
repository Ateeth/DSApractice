//Problem Link : https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

package com.ateeth.LeetCodeDSA.arrays.easy;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KidsWithTheGreatestNumberOfCandies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> ans = new ArrayList<>();

        int max = 0 ;
        for(int i = 0 ; i < candies.length ; ++i){
            max = Math.max(max , candies[i]) ;
        }

        for(int i = 0 ; i < candies.length ; ++i){
            if((max - extraCandies) <= candies[i]){
                ans.add(true) ;
            }else{
                ans.add(false) ;
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

        int n ;
        System.out.println("Enter the number of extra candies ") ;
        n = sc.nextInt() ;

        List<Boolean> ans = kidsWithCandies(nums , n) ;

        for(int i = 0 ; i < ans.size() ; ++i){
            System.out.print(ans.get(i) + " " ) ;
        };
    }
}

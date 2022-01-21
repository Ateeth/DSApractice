//Problem Link : https://leetcode.com/problems/find-smallest-letter-greater-than-target/
package com.ateeth.LeetCodeDSA.searching.easy;

import java.util.Scanner;

public class FindTheSmallestLetterGreaterThanTarget {

    public static char nextGreatestLetter(char[] letters, char target) {
        int beg = 0 , end = letters.length - 1 ;

        //in this binary search we will just wait for the condition to break i.e in the end we will wait for beg == end + 1
        //after this condition we would have reached the optimal index with beg and will return to user
        while(beg <= end){
            int mid = beg + (end - beg) / 2 ;

            if(letters[mid] > target){
                //if letter found is greater than target just move end = mid - 1
                end = mid - 1 ;
            }else{
                //if letter at mid is lesser than target just make beg = mid + 1
                beg = mid + 1 ;
            }
        }

        //we will return letters[beg] but the reason letters[beg % letter.length]
        //is to avoid going out of bounds if beg == letters.length we return letters[0] as given in the qn
        //to ensure index is within the bounds if letters array we do beg % letters.length
        return letters[beg % letters.length] ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt() ;

        System.out.println("Enter the elements of letters array in sorted order : ");
        char[] letters = new char[n] ;
        for(int i = 0 ; i < n ; ++i){
            letters[i] = sc.next().charAt(0);
        }

        System.out.println("Enter the target letter : ");
        char target = sc.next().charAt(0);

        char ans = nextGreatestLetter(letters , target);
        System.out.println(ans);
    }
}

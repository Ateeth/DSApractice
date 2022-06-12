//Problem Link : https://leetcode.com/problems/find-the-duplicate-number/
package com.ateeth.StriverSheet.Arrays2;

import java.util.* ;
public class FindDuplicateNumber {
    //extra space approach
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        int[] freq = new int [n] ;


        for( int i = 0 ; i < n ; ++i ){
            if(freq[arr.get(i) - 1] == 0){
                freq[arr.get(i) - 1] = Integer.MAX_VALUE ;
            }else{
                return arr.get(i) ;
            }
        }
        return -1 ;

    }

    //Cycle sort approach
    public static int findDuplicate1(ArrayList<Integer> arr, int n) {
         int i = 0;
         int temp , temp1;
         while( i < arr.size() ){
             //correct index of arr[i] is i - 1
             int correct = arr.get(i) - 1 ;

             //swap arr[i] to its correct index
             if(arr.get(i) != arr.get(correct)){
                 temp = arr.get(i) ;
                 temp1 = arr.get(correct) ;
                 arr.set(i , temp1) ;
                 arr.set(correct , temp) ;
             }

             //arr[i] at correct position proceed
             else{
                 ++i ;
             }
         }

         for(i = 0 ; i < arr.size() ; ++i){
             if(arr.get(i) != i + 1  ){
                 return arr.get(i) ;
             }
         }

         return -1 ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter number of elements : ");
        int n = sc.nextInt()  ;

        ArrayList<Integer> arr = new ArrayList<>() ;
        System.out.println("Enter array elements : ");
        for(int i = 0 ; i < n ; ++i){
            arr.add(sc.nextInt()) ;
        }

        System.out.println(findDuplicate(arr , n));
        System.out.println(findDuplicate1(arr , n));
    }
}

//Problem Link : https://www.geeksforgeeks.org/given-an-array-of-numbers-arrange-the-numbers-to-form-the-biggest-number/
package com.ateeth.GeeksForGeeksDSA.SDESheet.Arrays.Important.TrickyProblemNewConceptToPerformOptimally;

import java.util.* ;
public class LargestNumberFormedFromAnArray {
    /*
   Arr[] = {3, 30, 34, 5, 9}
   pass 1 :
   lock pos 0 :
   3 , 30 => 330 / 303 ignore
   3 , 34 => 334 / 343 swap 3 34
   updated : 34 30 3 5 9
   34 , 5 => 345 / 534 swap 5 , 34
   updated : 5 30 3 34 9
   5 , 9 => 59 / 95 swap 9 , 5
   updated : 9 30 3 34 5

   pos 0 is 9 confirmed
   9 30 3 34 5
   pass 2 :
   lock pos 1
   30 , 3 => 303 / 330 swap 30 , 3
   updated : 9 3 30 34 5
   3 , 34 => 334 / 343 swap 3 , 34
   updated : 9 34 30 3 5
   34 , 5 => 345 / 534 swap 34 , 5
   updated : 9 5 30 3 34

   pos 0 is 9 , pos 1 is 5 confirmed
   9 5 30 3 34
   pass 3 :
   lock pos 2
   30 , 3 => 303 / 330 swap 30 , 3
   updated : 9 5 3 30 34
   3 , 34 => 334 / 343 swap 3 , 34
   updated : 9 5 34 30 3

   pos 0 is 9 , pos 1 is 5 , pos 2 is 34 confirmed
   9 5 34 30 3
   pass 4 :
   lock pos 3
   30 , 3 : 303 / 330 swap 3 , 30
   updated : 9 5 34 3 30

   final pos : 9 5 34 3 30
   number : 9534330



   */
    public static String printLargest(int[] arr1) {
        if(arr1.length == 0){
            return "" ;
        }

        String arr[] = new String[arr1.length] ;
        for(int i = 0 ; i < arr.length ; ++i){
            arr[i] = Integer.toString(arr1[i]) ;
        }
        //custom comparator of stings
        Arrays.sort(arr , new Comparator<String>(){
            public int compare(String a , String b){
                String o1 = a + b ;
                String o2 = b + a ;
                //returns if o2 is greater comparison to o1
                //if yes swap them
                return o2.compareTo(o1) ;
            }
        });


        StringBuilder sb = new StringBuilder() ;
        for(String s : arr){
            sb.append(s) ;
        }

        return sb.toString() ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter value of n : ");
        int n = sc.nextInt() ;

        int[] arr = new int[n] ;
        System.out.println("Enter array elements : ");
        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt() ;
        }

        System.out.println(printLargest(arr));
    }
}

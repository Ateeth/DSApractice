//Problem Link : https://leetcode.com/problems/flipping-an-image/

package com.ateeth.LeetCodeDSA.arrays.easy;

import java.util.Scanner;

public class FlippingAnImage {

    public static int[][] flipAndInvertImage(int[][] image) {
        int[][] res = new int[image.length][image[0].length] ;
        for( int i = 0 ; i < image.length ; ++i ){
            for(int j = image[0].length - 1 ; j >= 0 ; --j ){
                if(image[i][j] == 0){
                    res[i][image[0].length - 1 - j] = 1 ;
                }else{
                    res[i][image[0].length - 1 - j] = 0 ;
                }
            }
        }
        return res ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt() ;

        System.out.println("Enter the elements of the matrix: ") ;
        int[][] image = new int[n][n] ;

        for(int i = 0 ; i < n ; ++i){
            for(int j = 0 ; j < n ; ++j){
                image[i][j] = sc.nextInt() ;
            }
        }

        int[][] ans = flipAndInvertImage(image) ;
       for(int i = 0 ; i < n ; ++i){
           for(int j = 0 ; j < n ; ++j){
               System.out.print(ans[i][j] +  " " ) ;
           }
           System.out.println() ;
       }
    }
}

//Problem Link : https://leetcode.com/problems/matrix-diagonal-sum/
package com.ateeth.LeetCodeDSA.arrays.easy.CouldNotThinkOfOptimalSolution;

import java.util.Scanner;

public class DiagonalSum {

    public static int diagonalSum(int[][] mat) {
        /*int sum = 0 ;

        for(int i = 0 ; i < mat.length ; ++i){
            for(int j = 0 ; j < mat[0].length ; ++j){
                //major diagonal
                if(i == j){
                    sum += mat[i][j] ;
                }

                //minor diagonal
                if( i!= j && (i + j == mat.length - 1)){
                    sum += mat[i][j] ;
                }
            }
        }

        return sum;*/
        int res = 0;
        int n = mat.length;
        for (int i=0; i<n; i++) {
            res += mat[i][i]; // Primary diagonals are row = column!
            res += mat[n-1-i][i]; // Secondary diagonals are row + column = n-1!
        }
        return n % 2 == 0 ? res : res - mat[n/2][n/2]; // if n is a odd number, that mean we have added the center element twice!
    }

    public static void main(String[] args){
        int n ;
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Enter the number of rows for the square matrix : ");
        n = sc.nextInt() ;

        System.out.println("Enter the values of the matrix : ");
        int[][] mat = new int[n][n] ;
        for(int i = 0 ; i < n ; ++i){
            for(int j = 0 ; j < n ; ++j){
                mat[i][j] = sc.nextInt() ;
            }
        }

        int ans = diagonalSum(mat) ;
        System.out.println(ans);
    }
}

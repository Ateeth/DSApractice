//Problem Link :https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/
package com.ateeth.LeetCodeDSA.arrays.easy.CouldNotThinkOfOptimalSolution;

import java.util.Scanner;

public class DetermineWhetherMatrixCanBeObtainedByRotation {

    public static boolean findRotation(int[][] mat, int[][] target) {
        for(int i = 0; i < 4; i++){
            /* TO ROTATE THE MATRIX YOU MUST TRANSPOSE IT THEN REVERSE IT */

            //to transpose
            transpose(mat);

            //to reverse
            reverse(mat);

            //check if matrix match target
            if(check(mat,target)){
                return true;
            }
        }
        return false;
    }

    public static boolean check(int[][] a,int[][] b){
        //compare all values of matrix a and b and return true or false
        for(int i = 0 ; i < a.length ; ++i){
            for(int j = 0 ; j < b.length ; ++j){
                if(a[i][j] != b[i][j]){
                    return false ;
                }
            }
        }
        return true;
    }
    // Image rotate code
    public static void transpose(int[][] a){
        //transpose of matrix
        for(int i = 0 ; i < a.length ; ++i){
            //when j >= i swap the values
            for(int j = i ; j < a[0].length ; ++j){
                int temp = a[i][j] ;
                a[i][j] = a[j][i] ;
                a[j][i] = temp ;
            }
        }
    }
    public static void reverse(int[][] a){
        for(int i = 0 ; i < a.length ; ++i){
            //do till half column then swap the values which will result in row getting reversed
            for(int j = 0 ; j < a[0].length/2 ; ++j){
                int temp = a[i][j] ;
                a[i][j] = a[i][a.length - 1 - j] ;
                a[i][a.length - 1 - j]  = temp ;
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of rows for the matrix : ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n] ;
        System.out.println("Enter the values for the matrix : ");
        for(int i = 0 ; i < n ; ++i){
            for(int j = 0 ; j < n ; ++j){
                matrix[i][j] = sc.nextInt() ;
            }
        }

        int[][] target = new int[n][n] ;
        System.out.println("Enter the values for the target matrix : ");
        for(int i = 0 ; i < n ; ++i){
            for(int j = 0 ; j < n ; ++j){
                target[i][j] = sc.nextInt() ;
            }
        }

        boolean ans = findRotation(matrix , target) ;
        System.out.println(ans);
    }
}

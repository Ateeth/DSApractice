//Problem Link : https://leetcode.com/problems/set-matrix-zeroes/
package com.ateeth.LeetCodeDSA.arrays.medium.CouldNotThinkOfOptimalSolution;

import java.util.Arrays;
import java.util.Scanner;

/*
First traverse each and every row of matrix
if a cell is 0
i) check if it is in the first column then make fc = true if it is
ii) check if it is in the first row make fr = true if it is
iii) make the first element of the row and column the element is present in to be 0


Traverse the matrix again
if the first column or first row has a 0 make full row or column 0
now check fr and fc if any r true
if fr is true then the first row had a zero prior itself so make all the elements in the row  = 0
if fc is true then the first row had a zero prior itself so make all the elements in the row  = 0
 */
public class SetMatrixZeroes {

    public static int[][] setZeroes(int[][] matrix) {
        boolean fr = false, fc = true;

        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[0].length; ++j) {

                //a cell of the matrix has been found out as 0
                if (matrix[i][j] == 0) {
                    if (i == 0) { //first row had a 0 at first itself
                        fr = true;
                    }
                    if (j == 0) { //first column had a zero at first itself
                        fc = true;
                    }

                    //set the first element in the same row as 0
                    matrix[i][0] = 0;

                    //set the first element in the same column as 0
                    matrix[0][j] = 0;
                }
            }
        }

        //traverse the matrix except the first row or first column thus index starts from 1
        for (int i = 1; i < matrix.length; ++i) {
            for (int j = 1 ; j < matrix[i].length ; ++j){

                /*
                    if the first element in the same row is 0 or the first element in the same column is 0
                    if condition true => there was a 0 in the same row or column so make the cell 0
                */
                if(matrix[0][j] == 0 || matrix[i][0] == 0){
                    matrix[i][j] = 0 ;
                }
            }
        }

        /* if fr is true it means the first row aldready had a 0 prior itself so make entire first row as 0 */
        if(fr == true){
            for(int i = 0 ; i < matrix[0].length ; ++i){
                matrix[0][i] = 0 ;
            }
        }

        /* if fc is true it means the first column already had a 0 prior itself so make entire first column as 0 */
        if(fc == true){
            for(int i = 0 ; i < matrix.length ; ++i){
                matrix[i][0] = 0 ;
            }
        }

        return matrix ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the dimensions of the matrix : ");
        int m = sc.nextInt() ;
        int n = sc.nextInt() ;

        System.out.println("Enter the elements of the matrix : ");
        int[][] matrix = new int[m][n] ;
        for(int i = 0 ; i < m ; ++i){
            for(int j = 0 ; j < n ; ++j){
                matrix[i][j] = sc.nextInt() ;
            }
        }

        int[][] ans = setZeroes(matrix) ;
        for(int i = 0 ; i < ans.length ; ++i){
            System.out.println(Arrays.toString(ans[i]));
            System.out.println();
        }
    }
}

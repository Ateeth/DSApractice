//Problem link : https://leetcode.com/problems/transpose-matrix/
package com.ateeth.LeetCodeDSA.arrays.easy;

import java.util.Arrays;
import java.util.Scanner;

public class TransposeMatrix {

    //square matrix only
    public static int[][] transpose(int[][] matrix) {
        for(int i = 0 ; i < matrix.length ; ++i){
            for(int j = i ; j < matrix.length ; ++j){
                int temp = matrix[i][j] ;
                matrix[i][j] = matrix[j][i] ;
                matrix[j][i] = temp  ;
            }
        }
        return matrix ;
    }

    /*Method 2
    For non square and square matrix as well
    this involves traversing the matrix column by column stor
    result in another matrix */
    public static int[][] transpose1(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;
        int n  , m;
        System.out.println("Enter the number of rows in the square matrix : ");
        m = sc.nextInt() ;

        System.out.println("Enter the number of columns in the square matrix : ");
        n = sc.nextInt() ;

        int[][]matrix = new int[m][n] ;
        System.out.println("Enter the elements of the matrix");
        for(int i = 0 ; i < m ; ++i){
            for(int j = 0 ; j < n ; ++j){
                matrix[i][j] = sc.nextInt() ;
            }
        }

        if( m == n ) {
            matrix = transpose(matrix);
        }else{
            matrix = transpose1(matrix) ;
        }
        System.out.println("Transposed matrix : ");
        for(int i = 0 ; i < n ; ++i){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}

//Problem Link : https://leetcode.com/problems/reshape-the-matrix/
package com.ateeth.LeetCodeDSA.arrays.easy.CouldNotThinkOfLogicAtAll;

import java.util.Arrays;
import java.util.Scanner;

public class ReshapeTheMatrix {

    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        //get the number of rows and cols of orignal matrix
        int rows = nums.length ;
        int columns = nums[0].length ;

        if(rows*columns != r*c){ //not compatible
            return nums ;
        }

        int row_no = 0 ;
        int col_no = 0 ;

        int[][] output = new int[r][c] ;

        //traverse orignal array row wise and add elements by column in the output
        //once all columns in row are filled go on to next row
        for(int  i = 0 ; i < rows ; ++i){
            for(int j = 0 ; j < columns ; ++j){
                output[row_no][col_no] = nums[i][j] ;
                ++col_no ; //increment col_no

                if(col_no == c){//all cols in row r filled move onto next row
                    ++row_no ;
                    col_no  = 0 ;
                }
            }
        }
        return output ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of rows and columns for the matrix : ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        System.out.println("Enter the elements of the matrix : ");
        int[][] matrix = new int[m][n] ;
        for(int i = 0 ; i < m ; ++i){
            for(int j = 0 ; j < n ; ++j){
                matrix[i][j] = sc.nextInt() ;
            }
        }

        System.out.println("Enter the values of r and c : ");
        int r = sc.nextInt() ;
        int c = sc.nextInt() ;
        int[][] ans = matrixReshape(matrix , r , c) ;

        for(int i = 0 ; i < r ; ++i){
            System.out.println(Arrays.toString(ans[i]));
            System.out.println();
        }
    }
}

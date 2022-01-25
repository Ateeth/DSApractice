//Problem Link : https://leetcode.com/problems/search-a-2d-matrix/
package com.ateeth.LeetCodeDSA.searching.medium.CouldNotThinkOfOptimalSolution;

import java.util.Scanner;

public class SearchA2DMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {
        int col = matrix[0].length -1  ;
        int row = 0 ;

        while( row < matrix.length && col >= 0 ){
            if(matrix[row][col] == target){
                return true ;
            }else if(matrix[row][col] > target){
                --col ;
            }else{
                ++row ;
            }
        }

        return false ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of rows : ");
        int r = sc.nextInt() ;
        System.out.println("Enter the number of columns : ");
        int c = sc.nextInt();

        int[][] matrix = new int[r][c] ;
        System.out.println("Enter the elements of the matrix : ");
        for(int i = 0 ; i < r ; ++i){
            for(int j = 0 ; j < c; ++j){
                matrix[i][j] = sc.nextInt() ;
            }
        }

        System.out.println("Enter the target element : ");
        int target = sc.nextInt() ;

        boolean ans = searchMatrix(matrix , target) ;
        System.out.println(ans);
    }
}

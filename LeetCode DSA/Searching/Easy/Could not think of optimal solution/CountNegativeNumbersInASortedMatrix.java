//Problem Link : https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
package com.ateeth.LeetCodeDSA.searching.easy.CouldNotThinkOfOptimalSolution;

import java.util.Scanner;

public class CountNegativeNumbersInASortedMatrix {

    public static int countNegatives(int[][] grid){
        int beg = 0 , end = grid[0].length - 1 , ctr = 0 ;

        /*
            For every row look for the first binary number
        */
        for(int i = 0 ; i < grid.length ; ++i){
            while(beg <= end){
                int mid = beg + (end - beg) / 2 ;

                //see if more negative left side
                if(grid[i][mid] < 0){
                    end = mid - 1 ;
                }

                //as positive we need to look at right side of array for negative
                else{
                    beg = beg + 1 ;
                }
            }
            /*
            now after the condition breaks beg will contain location of first negative number
            if it exists in the row
            */
            ctr += grid[i].length - beg ;

            /*
                for the next row end initialize
                we are making use of the fact it is sorted column wise as well
                which implies the first negative on the next row will be on the
                left half of the position of the first negative

                also can be end = grid[i].length - 1
             */
            end = beg - 1 ;

            //initialize beg for the next row
            beg = 0 ;
        }

        return ctr ;
    }

    /*
    Method 2 linear search every row till first negative is found
    public static int countNegatives(int[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] < 0){
                count +=  grid[i].length - j;
                break;
                }
            }
        }
        return count;
    }
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of rows and columns in the matrix : ");
        int m = sc.nextInt() ;
        int n = sc.nextInt() ;

        int[][] matrix = new int[m][n] ;
        System.out.println("Enter the elements of the matrix : ");
        for(int i = 0 ; i < m ; ++i){
            for(int j = 0 ; j < n ; ++j){
                matrix[i][j] = sc.nextInt() ;
            }
        }

        int ans = countNegatives(matrix) ;
        System.out.println(ans);
    }
}

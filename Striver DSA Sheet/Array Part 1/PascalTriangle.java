// Problem Link : https://leetcode.com/problems/pascals-triangle/
package com.ateeth.StriverSheet.Arrays1;

import java.util.* ;

/* for the for loop of computing
store the prev row elements in a variable
if first or last element of row push 1
else push the j - 1  column and jth column sum of previous row

other method ncr can be used but too expensive for time complexity
 */
public class PascalTriangle {
    public static ArrayList<ArrayList<Long>> printPascal(int n) {
        ArrayList<ArrayList<Long>> ans = new ArrayList<ArrayList<Long>>() ;
        ArrayList<Long> prev = null ;
        ArrayList<Long> row  ;

        for(int i = 0 ; i < n ; ++i){
            row = new ArrayList<Long>() ;
            for(int j = 0 ; j <= i ; ++j){
                if(j == 0 || j == i){
                    row.add((long) 1) ;
                }else{
                    row.add(prev.get(j - 1) + prev.get(j)) ;
                }
            }
            ans.add(row) ;
            prev = row ;
        }

        return ans ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter value of n : ");
        int n = sc.nextInt() ;

        System.out.println(printPascal(n));
    }
}

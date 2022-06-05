//Problem Link : https://leetcode.com/problems/decode-xored-array/
package com.ateeth.LeetCodeDSA.bitwise.easy.CouldNotThinkOfOptimalSolution;

/*
Explanation
cur means the current decoded element.

For each element we have
A[i] = res[i] ^ res[i+1]
A[i] ^ A[i] ^ res[i+1] = res[i] ^ res[i+1] ^ A[i] ^ res[i+1]
res[i+1] = res[i] ^ A[i]

So we use the conslusion above,
iterate the input encoded array A,
update res[i + 1] = res[i] ^ A[i].


Complexity
Time O(n)
Space O(n)

*/

import java.util.* ;
public class DecodeXORedArray {
    public static int[] decode(int[] A, int first) {
        int n = A.length, res[] = new int[n + 1];
        res[0] = first;
        for (int i = 0; i < n; ++i)
            res[i + 1] = res[i] ^ A[i];
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter size of array : ");
        int n = sc.nextInt(); ;

        int[] A = new int[n] ;
        System.out.println("Enter elements of the array : ");
        for(int i = 0 ; i < n ; ++i){
            A[i] = sc.nextInt() ;
        }

        System.out.println("Enter the value of first : ");
        int first  = sc.nextInt() ;

        System.out.println(Arrays.toString(decode(A , first)));
    }
}

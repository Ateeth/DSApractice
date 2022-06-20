package com.ateeth.LeetCodeDSA.Recursion.medium;

import java.util.Scanner;

public class KthSymbolInGrammar {
  /*
    See the tree below to see how values in each row relate to the parent row values. The rows and the indexes for the nodes in each row are 1-based.

            Row1
                            0
                        /       \
    Row2		       0         1
                     /   \     /   \
    Row3	        0     1   1     0
                   / \   / \ / \   / \
    Row4		  0  1   1 0 1  0  0  1

    Index(for Row 4)->
                  1  2   3 4 5  6  7  8
    Notice that:

    the parent of kth index in nth row is
    k/2 index in the n-1 row for even numbered indexes.
            (k+1)/2 index in the n-1 row for odd numbered indexes.
    Also notice that the kth value of the index in nth row is:

    flipped (reversed) value of the parent i.e. k/2 index in the n-1 row for even numbered indexes.
    same value as for the parent i.e. the (k+1)/2 index in the n-1 row for odd numbered indexes.
    which gets us to this solution:
*/
    public static int kthGrammar(int N, int K) {

        // base case
        if(N==1) {
            return 0;
        }

        if(K%2==1) {
            return kthGrammar(N-1, (K+1)/2);
        } else {
            return flip(kthGrammar(N-1, K/2));
        }
    }

    public static int flip(int val) {
        return val==0? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in)  ;
        System.out.println("Enter n : ");
        int n = sc.nextInt() ;

        System.out.println("Enter k : ");
        int k = sc.nextInt();

        System.out.println(kthGrammar(n , k));
    }
}

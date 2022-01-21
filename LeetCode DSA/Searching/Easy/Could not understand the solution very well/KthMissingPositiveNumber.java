//Problem Link : https://leetcode.com/problems/kth-missing-positive-number/

package com.ateeth.LeetCodeDSA.searching.easy.HadDifficultyUnderstandingTheSolution;

import java.util.Scanner;

/*
Explanation
Assume the final result is x,
And there are m number not missing in the range of [1, x].
Binary search the m in range [0, A.size()].

If there are m number not missing,
that is A[0], A[1] .. A[m-1],
the number of missing under A[m] is A[m] - 1 - m.

If A[m] - 1 - m < k, m is too small, we update left = m.
If A[m] - 1 - m >= k, m is big enough, we update right = m.

Note that, we exit the while loop, l = r,
which equals to the number of missing number used.
So the Kth positive number will be l + k.


Complexity
Time O(logN)
Space O(1)
 */
public class KthMissingPositiveNumber {
/*
public boolean isPresent(int[] arr, int k){
        int start=0;
        int end=arr.length -1;
        int mid=start+(end-start)/2;
        while(start<=end){
            if(arr[mid]==k){
                return true;
            }
            else if(arr[mid]>k){
                end=mid-1;
            }else{
                start=mid+1;
            }
            mid=start+(end-start)/2;
        }
        return false;
    }
    public int findKthPositive(int[] arr, int k) {
        int maxi=arr[0];
        //for(int i=0;i<)
       int c=0;
        int i=1;
        while(c!=k){
            if(!isPresent(arr,i)){
                c++;
            }
            i++;
        }
        return i-1;
    }
 */
    public static int findKthPositive(int[] A, int k) {
        int l = 0, r = A.length, m;
        while (l < r) {
            m = (l + r) / 2;
            if (A[m] - 1 - m < k)
                l = m + 1;
            else
                r = m;
        }
        return l + k;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt() ;

        int[] arr = new int[n] ;
        System.out.println("Enter the elements of the array : ");
        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt() ;
        }

        System.out.println("Enter the value of k : ");
        int k = sc.nextInt() ;

        int ans = findKthPositive(arr , k) ;
        System.out.println(ans);
    }
}

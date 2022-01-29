//Problem Link : https://www.geeksforgeeks.org/allocate-minimum-number-pages/
//Youtube video : https://youtu.be/gYmWHvRHu-s

package com.ateeth.LeetCodeDSA.searching.hard.VeryImportant;

import java.util.ArrayList;
import java.util.Scanner;

public class AllocateMinimumNumberOfPages {

    public static boolean isPossible(ArrayList<Integer> A, int pages, int students) {
        int cnt = 0;
        int sumAllocated = 0;
        for(int i = 0;i<A.size();i++) {
            if(sumAllocated + A.get(i) > pages) {
                cnt++;
                sumAllocated = A.get(i);
                if(sumAllocated > pages) return false;
            }
            else {
                sumAllocated += A.get(i);
            }
        }
        if(cnt < students) return true;
        return false;
    }
    public static int books(ArrayList<Integer> A, int B) {
        if(B > A.size()) return -1;
        int low = A.get(0);
        int high = 0;
        for(int i = 0;i<A.size();i++) {
            high = high + A.get(i);
            low = Math.min(low, A.get(i));
        }
        int res = -1;
        while(low <= high) {
            int mid = (low + high) >> 1;
            if(isPossible(A, mid, B)) {
                res = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        // return res -> this is also correct
        return low;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter number of books : ");
        int len = sc.nextInt() ;

        System.out.println("Enter the number of pages for each book : ");
        ArrayList<Integer> book = new ArrayList<>() ;
        for(int i = 0 ; i < len ; ++i){
            book.add(sc.nextInt()) ;
        }

        System.out.println("Enter number of students : ");
        int n = sc.nextInt() ;

        int ans = books(book , n) ;
        System.out.println(ans);

    }

}

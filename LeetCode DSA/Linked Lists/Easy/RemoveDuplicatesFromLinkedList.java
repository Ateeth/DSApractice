//Question Link : https://leetcode.com/problems/remove-duplicates-from-sorted-list/
package com.ateeth.LeetCodeDSA.LinkedLists;

import java.util.Scanner;

public class RemoveDuplicatesFromLinkedList  {


    public static void main(String[] args) {
        SinglyLinkedList ll = new SinglyLinkedList();
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Enter number of elements to be entered into the linked list : ");
        int n = sc.nextInt() ;

        System.out.println("Enter values of linked list : ");
        int i , num;

        for(i = 0 ; i < n ; ++i){
            num = sc.nextInt() ;
            ll.insertLast(num) ;
        }

        ll.deleteDuplicates();

    }

    /*
    void deleteDuplicates() {
        display();
        if(head == null){
            return  ;
        }

        Node temp = head ;
        while(temp.next != null){
            if(temp.val == temp.next.val){
                temp.next = temp.next.next ;
            }else{
                temp = temp.next ;
            }
        }

        display();
    }
     */
}

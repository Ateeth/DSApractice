package com.ateeth.LeetCodeDSA.LinkedLists;

import java.util.Scanner;

public class RecursiveInsertLinkedList {
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

        System.out.println();
        ll.display();

        System.out.println("Enter position to add new node to linked list : ");
        int pos = sc.nextInt();

        System.out.println("Enter value of new node of linked list : ");
        int value = sc.nextInt() ;

        ll.insertRec(value,pos);

        ll.display();
    }
}

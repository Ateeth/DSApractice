package com.ateeth.LeetCodeDSA.LinkedLists;

import java.util.Scanner;

public class MergeTwoSortedLinkedLists {

    Node head ;
    Node tail ;

    int size;

    public MergeTwoSortedLinkedLists(){
        this.size = 0 ;
    }

    static class Node{
        int val ;
        Node next ;

        Node(int val){
            this.val = val ;
        }

        Node(int val , Node next){
            this.val = val ;
            this.next = next ;
        }

    }

    void insertLast(int val){
        if(size == 0){
            insertFirst(val);
            return ;
        }

        Node node = new Node(val);
        tail.next = node ;
        node.next = null ;
        tail = node ;
        ++size ;
    }

    void insertFirst(int val){
        Node node = new Node(val);
        if(head == null){
            head = node ;
            tail = node ;
            ++size ;
            return ;
        }
        node.next = head ;
        head = node ;
        ++size ;
    }

    void display(){
        System.out.println();
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next ;
        }

        System.out.print("END");
    }

    MergeTwoSortedLinkedLists mergeTwoSortedLinkedLists(MergeTwoSortedLinkedLists l1 , MergeTwoSortedLinkedLists l2){
        Node f = l1.head ;
        Node s = l2.head ;

        MergeTwoSortedLinkedLists ans = new MergeTwoSortedLinkedLists();

        while(f != null && s != null){
            if(f.val < s.val){
                ans.insertLast(f.val);
                f = f.next ;
            }else{
                ans.insertLast(s.val);
                s = s.next ;
            }
        }

        while(f != null){
            ans.insertLast(f.val);
            f = f.next ;
        }

        while(s != null){
            ans.insertLast(s.val);
            s = s.next ;
        }

        return ans ;
    }

    public static void main(String[] args) {
        MergeTwoSortedLinkedLists l1 = new MergeTwoSortedLinkedLists();
        MergeTwoSortedLinkedLists l2 = new MergeTwoSortedLinkedLists();

        Scanner sc = new Scanner(System.in) ;

        System.out.println("Enter number of elements to be entered into the first linked list : ");
        int n1 = sc.nextInt() ;

        System.out.println("Enter values of linked list1 : ");
        int i , num;

        for(i = 0 ; i < n1 ; ++i){
            num = sc.nextInt() ;
            l1.insertLast(num) ;
        }

        System.out.println("Enter number of elements to be entered into the second linked list : ");
        int n2 = sc.nextInt() ;

        System.out.println("Enter values of linked list2 : ");

        for(i = 0 ; i < n2 ; ++i){
            num = sc.nextInt() ;
            l2.insertLast(num) ;
        }

        MergeTwoSortedLinkedLists ans = l1.mergeTwoSortedLinkedLists(l1 , l2);
        ans.display();
    }
}

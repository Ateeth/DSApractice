package com.ateeth.LeetCodeDSA.LinkedLists;

public class SinglyLinkedList {

    Node head ;
    Node tail ;

    int size;

    public SinglyLinkedList(){
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

    void display(){
        System.out.println();
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next ;
        }

        System.out.print("END");
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    // insert using recursion
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }
    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index-1, node.next);
        return node;
    }


    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.val;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.val;

        prev.next = prev.next.next;
        size--;
        return val;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteFirst() {
        int val = head.val;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

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

    SinglyLinkedList mergeTwoSortedLinkedLists(SinglyLinkedList l1 , SinglyLinkedList l2){
        Node f = l1.head ;
        Node s = l2.head ;

        SinglyLinkedList ans = new SinglyLinkedList();

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
}

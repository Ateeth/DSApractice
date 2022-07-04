//Problem Link : https://takeuforward.org/data-structure/find-middle-element-in-a-linked-list/
package com.ateeth.StriverSheet.LinkedList5;

public class MiddleOfLinkedList {
    class Node
    {

        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    };

    public static Node findMiddle(Node head)
    {
        if(head == null || head.next == null){
            return null ;
        }

        Node fast = head ;
        Node slow = head ;

        while(fast != null && fast.next != null){
            fast = fast.next.next ;
            slow = slow.next ;
        }

        return slow ;
    }
}

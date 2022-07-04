//Problem Link : https://takeuforward.org/data-structure/reverse-a-linked-list/
package com.ateeth.StriverSheet.LinkedList5;

public class ReverseLinkedList {
    class LinkedListNode<T>
    {
        T data;
        LinkedListNode<T> next;
        public LinkedListNode(T data)
        {
            this.data = data;
        }
    }

    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head)
    {

        if(head == null || head.next == null){
            return head ;
        }

        LinkedListNode<Integer> prev = null ;
        LinkedListNode<Integer> current = head ;
        LinkedListNode<Integer> next = head.next ;

        while(current != null){
            current.next = prev ;
            prev = current ;
            current = next ;

            if(next != null){
                next = next.next ;
            }
        }

        head = prev ;
        return head;
    }
}

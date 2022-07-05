//Question Link : https://takeuforward.org/data-structure/delete-given-node-in-a-linked-list-o1-approach/
package com.ateeth.StriverSheet.LinkedList5;

public class DeleteNodeInALinkedList {
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
        LinkedListNode(T data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static void deleteNode(LinkedListNode<Integer> node) {
        node.data = node.next.data ;
        node.next = node.next.next ;
    }
}

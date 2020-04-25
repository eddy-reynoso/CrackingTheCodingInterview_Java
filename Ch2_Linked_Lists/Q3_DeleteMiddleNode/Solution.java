package Ch2_Linked_Lists.Q3_DeleteMiddleNode;

import Utilities.LinkedListNode;

/*
Implement an algorithm to delte a node in the middle of a singly linked list, given only access to that node.
*/
public class Solution {
    public static void main(String[] args) {
        LinkedListNode head = new LinkedListNode(0);

        LinkedListNode a = new LinkedListNode(4);
        LinkedListNode b = new LinkedListNode(4);
        LinkedListNode c = new LinkedListNode(2);
        LinkedListNode d = new LinkedListNode(9);
        LinkedListNode e = new LinkedListNode(1);
        LinkedListNode f = new LinkedListNode(4);
        LinkedListNode g = new LinkedListNode(2);
        LinkedListNode h = new LinkedListNode(2);

        head.setNext(a);
        a.setNext(b);
        b.setNext(c);
        c.setNext(d);
        d.setNext(e);
        e.setNext(f);
        f.setNext(g);
        g.setNext(h);

        deleteMiddleNode(g);
        head.printList();
    }

    public static void deleteMiddleNode(LinkedListNode n) {
        if (n == null || n.next == null) {
            return;
        }

        LinkedListNode node = n;
        LinkedListNode next = n.next;
        node.data = next.data;
        node.next = next.next;

    }

}
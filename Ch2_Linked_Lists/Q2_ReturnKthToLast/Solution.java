package Ch2_Linked_Lists.Q2_ReturnKthToLast;

import java.util.*;
import Utilities.LinkedListNode;

/*
Implement an algorithm to find the kth to last element of a single linked list.
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

        // head.printList();
        System.out.println(kthToLast(head, 2).data);
    }

    public static LinkedListNode kthToLast(LinkedListNode head, int k) {
        int length = 0;
        LinkedListNode node = head;

        while (node != null) {
            length++;
            node = node.next;
        }
        if (k > length || k == 0) {
            return null;
        }
        int iterations = length - k;
        node = head;
        while (iterations > 0) {
            node = node.next;
            iterations--;
        }

        return node;
    }
}
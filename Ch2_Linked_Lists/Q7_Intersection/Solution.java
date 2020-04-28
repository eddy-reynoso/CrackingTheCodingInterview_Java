package Ch2_Linked_Lists.Q7_Intersection;

import Utilities.LinkedListNode;
import java.util.*;

/*
Given two single linked lists, determine if the two lists intersect. Return the intersecting node.
Note that intersection is based on reference, not value. That is if the kth node of the linkedlist is the exact same node by reference
as the jth node of the second list, then they are intersecting.
*/
public class Solution {
    public static void main(String[] args) {

        LinkedListNode head = new LinkedListNode(3);
        LinkedListNode a = new LinkedListNode(5);
        LinkedListNode b = new LinkedListNode(8);
        LinkedListNode c = new LinkedListNode(8);
        LinkedListNode d = new LinkedListNode(5);
        LinkedListNode e = new LinkedListNode(3);
        LinkedListNode f = new LinkedListNode(3);
        LinkedListNode g = new LinkedListNode(2);
        LinkedListNode h = new LinkedListNode(2);

        LinkedListNode n1 = new LinkedListNode(9);
        n1.setNext(a);
        a.setNext(b);
        b.setNext(c);

        LinkedListNode n2 = new LinkedListNode(4);
        n2.setNext(d);
        d.setNext(e);
        e.setNext(c);
        System.out.println(intersection2(n1, n2).data);

        // System.out.println(getKthNode(n1, 1).data);
    }

    public static LinkedListNode intersection(LinkedListNode l1, LinkedListNode l2) {
        HashSet<LinkedListNode> set = new HashSet<LinkedListNode>();

        LinkedListNode node = l1;
        while (node != null) {
            set.add(node);
            node = node.next;
        }

        node = l2;
        while (node != null) {
            if (set.contains(node)) {
                return node;
            }
            node = node.next;
        }

        return null;
    }

    public static LinkedListNode intersection2(LinkedListNode l1, LinkedListNode l2) {

        LinkedListNode node1 = l1;
        LinkedListNode node2 = l2;

        LinkedListNode prev1 = null;
        LinkedListNode prev2 = null;

        int length1 = 0;
        int length2 = 0;

        while (node1 != null) {
            prev1 = node1;
            node1 = node1.next;
        }

        while (node2 != null) {
            prev2 = node2;
            node2 = node2.next;
        }

        if (prev1 != prev2) {
            return null;
        }

        int difference = length1 - length2;

        if (difference > 0) {
            node1 = getKthNode(l1, difference);
            node2 = l2;
        } else {
            node2 = getKthNode(l2, difference);
            node1 = l1;
        }

        while (node1 != null && node2 != null) {
            if (node1 == node2) {
                return node1;
            }
            node1 = node1.next;
            node2 = node2.next;
        }

        return null;
    }

    public static LinkedListNode getKthNode(LinkedListNode head, int k) {
        int difference = Math.abs(k);
        LinkedListNode node = head;
        for (int i = 0; i < difference; i++) {
            node = node.next;
        }
        return node;
    }
}
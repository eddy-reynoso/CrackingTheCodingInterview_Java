package Ch2_Linked_Lists.Q1_RemoveDups;

import java.util.*;
import Utilities.LinkedListNode;

/*
Write code to remove duplicates from an unsorted Linked List.

How would you solve this problem if a temporary buffer is not allowed.
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
        removeDupsWithoutBuffer(head);
        head.printList();
    }

    public static LinkedListNode removeDupsWithBuffer(LinkedListNode head) {
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(head.data);

        LinkedListNode node = head;

        while (node.next != null) {
            LinkedListNode currNext = node.next;
            if (set.contains(currNext.data)) {
                node.next = currNext.next;
            } else {
                set.add(currNext.data);
                node = currNext;
            }
        }

        return head;

    }

    public static LinkedListNode removeDupsWithoutBuffer(LinkedListNode head) {
        LinkedListNode slow = head;
        LinkedListNode fast = null;

        while (slow != null) {
            fast = slow;
            while (fast.next != null) {
                if (fast.next.data == slow.data) {
                    fast.next = fast.next.next;
                } else {
                    fast = fast.next;
                }
            }
            slow = slow.next;
        }

        return head;
    }
}

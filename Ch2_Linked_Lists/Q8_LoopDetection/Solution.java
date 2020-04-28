package Ch2_Linked_Lists.Q8_LoopDetection;

import Utilities.LinkedListNode;
import java.util.*;

/*
Given a circular linked list, return the node at the beginning of the loop.
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

        c.setNext(d);
        d.setNext(e);
        e.setNext(f);
        f.setNext(n1);
        System.out.println(loopDetection(n1).data);
    }

    public static LinkedListNode loopDetection(LinkedListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        LinkedListNode slow = head;
        LinkedListNode fast = head.next;

        while (fast != slow) {
            if (fast == null) {
                break;
            }
            fast = fast.next;
            if (fast == null) {
                break;
            }
            fast = fast.next;
            slow = slow.next;
        }

        return fast == slow ? fast : null;
    }

}
package Ch2_Linked_Lists.Q4_Partition;

import Utilities.LinkedListNode;

/*
Write code to partition a linked list around a value x, such that all nodes less than x come
before all nodes greater than or equal to x. If x is contained within th list, the partition element x can appear anywhere in 
the "right partition"; it does not need to appear between left and right partitions.

Example
Input: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [partition=5]
Output: 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8
*/
public class Solution {
    public static void main(String[] args) {
        LinkedListNode head = new LinkedListNode(3);

        LinkedListNode a = new LinkedListNode(5);
        LinkedListNode b = new LinkedListNode(8);
        LinkedListNode c = new LinkedListNode(5);
        LinkedListNode d = new LinkedListNode(10);
        LinkedListNode e = new LinkedListNode(2);
        LinkedListNode f = new LinkedListNode(1);
        // LinkedListNode g = new LinkedListNode(2);
        // LinkedListNode h = new LinkedListNode(2);

        head.setNext(a);
        a.setNext(b);
        b.setNext(c);
        c.setNext(d);
        d.setNext(e);
        e.setNext(f);
        // f.setNext(g);
        // g.setNext(h);

        head = partition(head, 5);
        head.printList();

    }

    public static LinkedListNode partition(LinkedListNode head, int partition) {
        LinkedListNode node = head;
        LinkedListNode leftHead = null;
        LinkedListNode leftTail = null;
        LinkedListNode rightHead = null;
        LinkedListNode rightTail = null;

        while (node != null) {
            if (node.data < partition) {
                if (leftHead == null) {
                    leftHead = new LinkedListNode(node.data);
                    leftTail = leftHead;
                } else {
                    leftTail.next = new LinkedListNode(node.data);
                    leftTail = leftTail.next;
                }
            } else {
                if (rightHead == null) {
                    rightHead = new LinkedListNode(node.data);
                    rightTail = rightHead;
                } else {
                    rightTail.next = new LinkedListNode(node.data);
                    rightTail = rightTail.next;
                }
            }
            node = node.next;
        }

        // leftHead.printList();
        // rightHead.printList();
        // leftTail.printList();
        // rightTail.printList();
        leftTail.next = rightHead;
        head = leftHead;
        // head.printList();
        return leftHead;
    }

}
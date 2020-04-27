package Ch2_Linked_Lists.Q6_Palindrome;

import Utilities.LinkedListNode;
import java.util.*;

/*
Implement a function to check if a linked list is a palindrome
*/
public class Solution {
    public static void main(String[] args) {
        LinkedListNode head = new LinkedListNode(3);

        LinkedListNode a = new LinkedListNode(5);
        LinkedListNode b = new LinkedListNode(8);
        LinkedListNode c = new LinkedListNode(8);
        LinkedListNode d = new LinkedListNode(5);
        LinkedListNode e = new LinkedListNode(3);
        // LinkedListNode f = new LinkedListNode(3);
        // LinkedListNode g = new LinkedListNode(2);
        // LinkedListNode h = new LinkedListNode(2);

        head.setNext(a);
        a.setNext(b);
        b.setNext(c);
        c.setNext(d);
        d.setNext(e);
        // e.setNext(f);
        // f.setNext(g);
        // g.setNext(h);
        System.out.println(palindrome(head));
        reverse(head).printList();
        head.printList();
    }

    public static boolean palindrome(LinkedListNode head) {
        LinkedListNode n = head;
        LinkedListNode r = reverse(head);

        while (n != null && r != null) {
            if (n.data != r.data) {
                return false;
            }
            n = n.next;
            r = r.next;
        }
        return n == null && r == null ? true : false;
    }

    public static LinkedListNode reverse(LinkedListNode head) {
        if (head == null) {
            return null;
        }

        Stack<LinkedListNode> stack = new Stack<LinkedListNode>();
        LinkedListNode node = head;
        LinkedListNode next = null;

        while (node != null) {
            stack.push(node);
            node = node.next;
        }

        head = new LinkedListNode(stack.pop().data);
        node = head;
        while (!stack.isEmpty()) {
            next = new LinkedListNode(stack.pop().data);
            node.next = next;
            next.next = null;
            node = node.next;
        }

        return head;
    }

}
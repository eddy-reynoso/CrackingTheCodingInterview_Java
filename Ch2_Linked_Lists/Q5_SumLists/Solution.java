package Ch2_Linked_Lists.Q5_SumLists;

//Incomplete
import Utilities.LinkedListNode;
import java.util.*;

/*
You have two numbers represented by a linked list, where each node contains a single digit.
The digits are stored in reverse order, such that the 1's digit is at the head of the list.
Wite a function that adds the two numbers and returns the sum as a linkedlist.

Example
Input: (7 -> 2 -> 6) + (5 -> 9 -> 2). That is 617 + 295
Output: (2 -> 1 -> 9) That is 912.
*/
public class Solution {
    public static void main(String[] args) {

        LinkedListNode n1 = new LinkedListNode(9);
        LinkedListNode a = new LinkedListNode(0);
        LinkedListNode b = new LinkedListNode(1);
        n1.setNext(a);
        a.setNext(b);

        LinkedListNode n2 = new LinkedListNode(1);
        LinkedListNode d = new LinkedListNode(0);
        LinkedListNode e = new LinkedListNode(1);
        n2.setNext(d);
        d.setNext(e);
        sumLists(n1, n2).printList();
    }

    public static LinkedListNode sumLists(LinkedListNode n1, LinkedListNode n2) {
        n1 = reverse(n1);
        n2 = reverse(n2);
        LinkedListNode n3 = new LinkedListNode(0);

        LinkedListNode node1 = n1;
        LinkedListNode node2 = n2;
        LinkedListNode node3 = n3;

        // int multipler = 1;
        int carry = 0;

        while (node1 != null && node2 != null) {
            int sum = node1.data + node2.data + carry;
            System.out.println(sum + " " + carry);
            if (carry == 1) {
                carry = 1;
                node3.next = new LinkedListNode(sum % 10);
            } else {
                node3.next = new LinkedListNode(sum);
                carry = 0;
            }
            // multipler *= 10;
            node1 = node1.next;
            node2 = node2.next;
            node3 = node3.next;
        }

        /*
         * while (node1 != null) { int sum = node1.data + carry; if (sum >= 10) { carry
         * = 1; node3.next = new LinkedListNode(sum % 10);
         * 
         * } else { carry = 0; node3.next = new LinkedListNode(sum); } node1 =
         * node1.next; node3 = node3.next; }
         * 
         * while (node2 != null) { int sum = node2.data + carry; if (sum >= 10) { carry
         * = 1; node3.next = new LinkedListNode(sum % 10);
         * 
         * } else { carry = 0; node3.next = new LinkedListNode(sum); } node2 =
         * node2.next; node3 = node3.next; }
         */
        // n3 = reverse(n3.next);
        return n3;
    }

    public static LinkedListNode reverse(LinkedListNode head) {
        if (head == null) {
            return null;
        }

        LinkedListNode node = head;
        LinkedListNode next = null;

        Stack<LinkedListNode> stack = new Stack<LinkedListNode>();

        while (node != null) {
            stack.push(node);
            node = node.next;
        }

        head = stack.pop();
        node = head;
        while (!stack.isEmpty()) {
            next = stack.pop();
            node.next = next;
            next.next = null;
            node = node.next;
        }
        return head;
    }

}
